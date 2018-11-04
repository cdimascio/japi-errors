import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.cdimascio.apierrors.AbstractApiError;
import io.github.cdimascio.apierrors.ApiError;
import io.github.cdimascio.apierrors.ApiErrorCreator;
import io.github.cdimascio.apierrors.wcp.ApiErrorWcp;
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
            throw ApiError.badRequest(message);
        });
        Assertions.assertNotNull(error.getTrace());
        Assertions.assertEquals(error.getStatus().getCode(), 400);
        Assertions.assertEquals(error.getErrors().get(0).getCode(), "bad_request");
        Assertions.assertEquals(error.getErrors().get(0).getMessage(), message);
    }

    @Test
    public void badRequestJson() {
        AbstractApiError error = ApiError.badRequest();
        JsonNode node = m.convertValue(error, JsonNode.class);
        assertNull(node.get("message"));
        assertEquals("bad_request", node.get("errors").get(0).get("code").asText());
        assertEquals("bad request", node.get("errors").get(0).get("message").asText());
    }
}
