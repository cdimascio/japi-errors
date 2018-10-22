import io.github.cdimascio.jwcperrors.ApiError;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApiErrorSpec {

    @Test
    public void badRequest() {
        String message = "oh no";
        ApiError error = Assertions.assertThrows(ApiError.class, () -> {
            throw ApiError.badRequest(message);
        });
        Assertions.assertEquals(error.getStatus().getCode(), 400);
        Assertions.assertEquals(error.getErrors().get(0).getCode(), "bad_request");
        Assertions.assertEquals(error.getErrors().get(0).getMessage(), message);
    }
}
