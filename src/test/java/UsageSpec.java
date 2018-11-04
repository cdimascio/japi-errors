import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import io.github.cdimascio.japierrors.ApiError;
import io.github.cdimascio.japierrors.ApiErrorCreator;
import io.github.cdimascio.japierrors.basic.ApiErrorBasic;
import io.github.cdimascio.japierrors.wcp.ApiErrorWcp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class UsageSpec {
    private ObjectMapper m = new ObjectMapper();

    @BeforeAll
    public static void beforeAll() {
        configureUnirest();
        ApiError.creator(ApiErrorCreator.BASIC);
    }

    @Test
    public void autoConvertToType() {
        ApiErrorBasic notFound = ApiError.unauthorized();
        assertEquals(401, notFound.getCode());
    }

    @Test
    public void throwsClassCastIfWrongType() {
        assertThrows(ClassCastException.class, () -> {
            ApiErrorWcp notFound = ApiError.notFound();
        });
    }

    @Test
    public void unirestAutoConvert() {
        try {
            ApiErrorBasic error = Unirest.get("http://mockbin.org/status/404/not_found").asObject(ApiErrorBasic.class).getBody();
            assertEquals(404, error.getCode());
        } catch (UnirestException e) {
            fail("exception unexpected");
        }
    }

    @Test
    public void serializeToJson() {
        try {
            String s = m.writeValueAsString(ApiError.badRequest());
            System.out.println(s);
            JsonNode json = m.readTree(s);
            assertNull(json.get("cause"));
            assertNull(json.get("message"));
            assertEquals(400, json.get("code").asInt());
            assertEquals("bad request", json.get("error").asText());
        } catch (IOException e) {
            e.printStackTrace();
            fail("unexpected exception");
        }
    }

    @Test
    public void deserializeToApiError() {
        JsonNode json = m.createObjectNode()
                .put("code", 400)
                .put("error", "bad request")
                .put("extra", "junk");

        ApiErrorBasic error = m.convertValue(json, ApiErrorBasic.class);

        assertEquals(400, error.getCode());
        assertEquals("bad request", error.getError());
    }

    @Test
    public void httpErrorToApiError() {
        try {
            ApiErrorBasic error = Unirest
                    .get("http://mockbin.org/status/404/not_found")
                    .asObject(ApiErrorBasic.class).getBody();

            assertEquals(404, error.getCode());
        } catch (UnirestException e) {
            e.printStackTrace();
            fail("unexpected exception");
        }
    }

    private static void configureUnirest() {
        ObjectMapper mapper = new ObjectMapper();
        Unirest.setObjectMapper(new com.mashape.unirest.http.ObjectMapper() {
            @Override
            public <T> T readValue(String value, Class<T> valueType) {
                try {
                    return mapper.readValue(value, valueType);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public String writeValue(Object value) {
                try {
                    return mapper.writeValueAsString(value);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}

