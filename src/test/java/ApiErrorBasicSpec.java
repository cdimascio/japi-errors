import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.cdimascio.apierrors.AbstractApiError;
import io.github.cdimascio.apierrors.ApiError;
import io.github.cdimascio.apierrors.ApiErrorCreator;
import io.github.cdimascio.apierrors.basic.ApiErrorBasic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ApiErrorBasicSpec {
    private ObjectMapper m = new ObjectMapper();

    @BeforeAll
    public static void beforeAll() {
        ApiError.creator(ApiErrorCreator.BASIC);
    }

    @Test
    public void badRequest() {
        String message = "oh no";
        ApiErrorBasic error = Assertions.assertThrows(ApiErrorBasic.class, () -> {
            throw ApiError.badRequest(message);
        });
        Assertions.assertNotNull(error.getError());
        assertEquals(400, error.getCode());
        assertEquals(message, error.getError());
    }

    @Test
    public void badRequestJson() {
        AbstractApiError error = ApiError.badRequest();
        JsonNode node = m.convertValue(error, JsonNode.class);
        assertNull(node.get("message"));
        assertEquals("bad request", node.get("error").asText());
        assertEquals(400, node.get("code").asInt());
    }
}
