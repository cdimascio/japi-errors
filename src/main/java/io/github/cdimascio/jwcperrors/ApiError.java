package io.github.cdimascio.jwcperrors;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@JsonAutoDetect(
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        creatorVisibility = JsonAutoDetect.Visibility.NONE
)
public class ApiError extends RuntimeException {
    @JsonProperty
    private String trace;
    @JsonProperty
    private List<ApiErrorDetails> errors;
    @JsonIgnore
    private HttpStatus status;

    private ApiError() {
        super();
    }

    /**
     * A general api error
     * @param trace A UUID that uniquely identifies this api error instance
     * @param errors A list of error details
     * @param status The http error status accompanying this error
     */
    public ApiError(String trace, List<ApiErrorDetails> errors, HttpStatus status) {
        this.trace = trace;
        this.errors = errors;
        this.status = status;
    }

    /**
     * Returns the uuid for this ApiError
     * @return The ApiError
     */
    public String getTrace() {
        return trace;
    }

    /**
     * Returns the list of errors for this ApiError
     * @return The ApiError
     */
    public List<ApiErrorDetails> getErrors() {
        return this.errors;
    }

    /**
     * Returns the http status for this ApiError
     * @return The ApiError
     */
    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ApiError{" +
                "trace='" + trace + '\'' +
                ", errors=" + errors +
                ", status=" + status +
                '}';
    }

    /**
     * Create a bad request api error using the specified throwable
     * @param t The exceptioo or throwable
     * @return The ApiError
     */
    public static ApiError badRequest(Throwable t) {
        return error(HttpStatus.BAD_REQUEST, t);
    }

    /**
     * Creates a bad request api error with the specified message
     * @param message The message
     * @return The ApiError
     */
    public static ApiError badRequest(String message) {
        return error(HttpStatus.BAD_REQUEST, message);
    }

    /**
     * Creates a bad request api error
     * @return The ApiError
     */
    public static ApiError badRequest() {
        return error(HttpStatus.BAD_REQUEST, "bad request");
    }

    /**
     * Creates a conflict api error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The ApiError
     */
    public static ApiError conflict(Throwable t) {
        return error(HttpStatus.CONFLICT, t);
    }

    /**
     * Creates a conflict api error with the specified message
     * @param message The message
     * @return The ApiError
     */
    public static ApiError conflict(String message) {
        return error(HttpStatus.CONFLICT, message);
    }

    /**
     * Creates a conflict error
     * @return The ApiError
     */
    public static ApiError conflict() {
        return error(HttpStatus.CONFLICT, "conflict");
    }

    /**
     * Create a forbidden error using the specified exception or throwable
     * @param t The exception or throwable
     * @return The ApiError
     */
    public static ApiError forbidden(Throwable t) {
        return error(HttpStatus.FORBIDDEN, t);
    }

    /**
     * Creates a forbidden error with the specified message
     * @param message The message
     * @return The ApiError
     */
    public static ApiError forbidden(String message) {
        return error(HttpStatus.FORBIDDEN, message);
    }

    /**
     * Creates a forbidden error
     * @return The ApiError
     */
    public static ApiError forbidden() {
        return error(HttpStatus.FORBIDDEN, "forbidden");
    }

    /**
     * Creates an internal server error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The ApiError
     */
    public static ApiError internalServerError(Throwable t) {
        return error(HttpStatus.INTERNAL_SERVER_ERROR, t);
    }

    /**
     * Creates an internal server error with the specified message
     * @param message
     * @return The ApiError
     */
    public static ApiError internalServerError(String message) {
        return error(HttpStatus.INTERNAL_SERVER_ERROR, message);
    }

    /**
     * Creates an internal server error
     * @return The ApiError
     */
    public static ApiError internalServerError() {
        return error(HttpStatus.INTERNAL_SERVER_ERROR, "internal server error");
    }

    /**
     * Creates a not acceptable error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The ApiError
     */
    public static ApiError notAcceptable(Throwable t) {
        return error(HttpStatus.NOT_ACCEPTABLE, t);
    }
    /**
     * Creates a not acceptable error with the specified message
     * @param message The message
     * @return The ApiError
     */
    public static ApiError notAcceptable(String message) {
        return error(HttpStatus.NOT_ACCEPTABLE, message);
    }

    /**
     * Creates a not acceptable error
     * @return The ApiError
     */
    public static ApiError notAcceptable() {
        return error(HttpStatus.NOT_ACCEPTABLE, "not found");
    }

    /**
     * Creates a not found error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The ApiError
     */
    public static ApiError notFound(Throwable t) {
        return error(HttpStatus.NOT_FOUND, t);
    }

    /**
     * Creates a not found error with the specified message
     * @param message The message
     * @return The ApiError
     */
    public static ApiError notFound(String message) {
        return error(HttpStatus.NOT_FOUND, message);
    }

    /**
     * Creates a not found error
     * @return The ApiError
     */
    public static ApiError notFound() {
        return error(HttpStatus.NOT_FOUND, "not found");
    }

    /**
     * Creates a not implemented error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The ApiError
     */
    public static ApiError notImplemented(Throwable t) {
        return error(HttpStatus.NOT_IMPLEMENTED, t);
    }

    /**
     * Creates a not implemented error with the specified message
     * @param message The message
     * @return The ApiError
     */
    public static ApiError notImplemented(String message) {
        return error(HttpStatus.NOT_IMPLEMENTED, message);
    }

    /**
     * Creates a not implemented error
     * @return The ApiError
     */
    public static ApiError notImplemented() {
        return error(HttpStatus.NOT_IMPLEMENTED, "not implemented");
    }

    /**
     * Creates a request entity too large error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The ApiError
     */
    public static ApiError requestEntityTooLarge(Throwable t) {
        return error(HttpStatus.REQUEST_ENTITY_TOO_LARGE, t);
    }

    /**
     * Creates a request entity too large error with the specified message
     * @param message The message
     * @return The ApiError
     */
    public static ApiError requestEntityTooLarge(String message) {
        return error(HttpStatus.REQUEST_ENTITY_TOO_LARGE, message);
    }

    /**
     * Creates a request entity too large error
     * @return The ApiError
     */
    public static ApiError requestEntityTooLarge() {
        return error(HttpStatus.NOT_IMPLEMENTED, "not implemented");
    }

    /**
     * Creates an unauthorized error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The ApiError
     */
    public static ApiError unauthorized(Throwable t) {
        return error(HttpStatus.UNAUTHORIZED, t);
    }

    /**
     * Creates an unauthorized error with the specified  message
     * @param message The message
     * @return The ApiError
     */
    public static ApiError unauthorized(String message) {
        return error(HttpStatus.UNAUTHORIZED, message);
    }

    /**
     * Creates an unauthorized error
     * @return The ApiError
     */
    public static ApiError unauthorized() {
        return error(HttpStatus.UNAUTHORIZED, "unauthorized");
    }

    /**
     * Creates an unsupported media type error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The ApiError
     */
    public static ApiError unsupportedMediaType(Throwable t) {
        return error(HttpStatus.UNSUPPORTED_MEDIA_TYPE, t);
    }

    /**
     * Creates an unsupported media type error with the specified message
     * @param message The message
     * @return The ApiError
     */
    public static ApiError unsupportedMediaType(String message) {
        return error(HttpStatus.UNSUPPORTED_MEDIA_TYPE, message);
    }

    /**
     * Creates an unsupported media type error
     * @return The ApiError
     */
    public static ApiError unsupportedMediaType() {
        return error(HttpStatus.UNSUPPORTED_MEDIA_TYPE, "unsupported media type");
    }
    private static ApiError error(HttpStatus status, String message) {
        final ApiErrorDetails details = new ApiErrorDetails();
        details.code = statusToCode(status);
        details.message = message;

        String trace = UUID.randomUUID().toString();
        List<ApiErrorDetails> errors = new ArrayList<ApiErrorDetails>() {{
            add(details);
        }};
        return new ApiError(trace, errors, status);
    }
    private static ApiError error(HttpStatus status, Throwable t) {
        final ApiErrorDetails details = new ApiErrorDetails();
        details.code = statusToCode(status);
        details.message = t.getMessage(); //.isEmpty() ? status.getReasonPhrase() : t.getMessage();

        String trace = UUID.randomUUID().toString();
        List<ApiErrorDetails> errors = new ArrayList<ApiErrorDetails>() {{
            add(details);
        }};
        return new ApiError(trace, errors, status);
    }
    private static String statusToCode(HttpStatus status) {
        return status.name().toLowerCase().replace(" ", "_");
    }
}


