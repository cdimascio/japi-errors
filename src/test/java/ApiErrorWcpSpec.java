import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.cdimascio.japierrors.ApiError;
import io.github.cdimascio.japierrors.ApiErrorCreator;
import io.github.cdimascio.japierrors.wcp.ApiErrorWcp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ApiErrorWcpSpec {
    private ObjectMapper m = new ObjectMapper();

    @BeforeAll
    public static void beforeAll() {
        ApiError.creator(ApiErrorCreator.WCP);
    }

    @Test
    public void badRequest() {
        String message = "oh no";
        ApiErrorWcp error = Assertions.assertThrows(ApiErrorWcp.class, () -> {
            throw ApiErrorWcp.badRequest(message);
        });
        Assertions.assertNotNull(error.getTrace());
        Assertions.assertEquals(error.getStatus().getCode(), 400);
        Assertions.assertEquals(error.getErrors().get(0).getCode(), "bad_request");
        Assertions.assertEquals(error.getErrors().get(0).getMessage(), message);
    }

    @Test
    public void badRequestJson() {
        ApiError error = ApiError.badRequest();
        JsonNode node = m.convertValue(error, JsonNode.class);
        assertNull(node.get("message"));
        assertEquals("bad_request", node.get("errors").get(0).get("code").asText());
        assertEquals("bad request", node.get("errors").get(0).get("message").asText());
    }

    @Test
    public void tooManyRequests() {
        String message = "oh no";
        ApiErrorWcp error = Assertions.assertThrows(ApiErrorWcp.class, () -> {
            throw ApiErrorWcp.tooManyRequests(message);
        });
        Assertions.assertNotNull(error.getTrace());
        Assertions.assertEquals(error.getStatus().getCode(), 429);
        Assertions.assertEquals(error.getErrors().get(0).getCode(), "too_many_requests");
        Assertions.assertEquals(error.getErrors().get(0).getMessage(), message);
    }
    @Test
    public void tooManyRequestsJson() {
        ApiError error = ApiError.tooManyRequests();
        JsonNode node = m.convertValue(error, JsonNode.class);
        assertNull(node.get("message"));
        assertEquals("too_many_requests", node.get("errors").get(0).get("code").asText());
        assertEquals("too many requests", node.get("errors").get(0).get("message").asText());
    }
}
