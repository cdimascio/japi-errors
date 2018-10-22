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

    public ApiError(String trace, List<ApiErrorDetails> errors, HttpStatus status) {
        this.trace = trace;
        this.errors = errors;
        this.status = status;
    }

    public String getTrace() {
        return trace;
    }

    public List<ApiErrorDetails> getErrors() {
        return this.errors;
    }

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

    public static ApiError badRequest(Throwable t) {
        return error(HttpStatus.BAD_REQUEST, t);
    }
    public static ApiError badRequest(String message) {
        return error(HttpStatus.BAD_REQUEST, message);
    }
    public static ApiError badRequest() {
        return error(HttpStatus.BAD_REQUEST, "bad request");
    }
    public static ApiError conflict(Throwable t) {
        return error(HttpStatus.CONFLICT, t);
    }
    public static ApiError conflict(String message) {
        return error(HttpStatus.CONFLICT, message);
    }
    public static ApiError conflict() {
        return error(HttpStatus.CONFLICT, "conflict");
    }
    public static ApiError forbidden(Throwable t) {
        return error(HttpStatus.FORBIDDEN, t);
    }
    public static ApiError forbidden(String message) {
        return error(HttpStatus.FORBIDDEN, message);
    }
    public static ApiError forbidden() {
        return error(HttpStatus.FORBIDDEN, "forbidden");
    }
    public static ApiError internalServerError(Throwable t) {
        return error(HttpStatus.INTERNAL_SERVER_ERROR, t);
    }
    public static ApiError internalServerError(String message) {
        return error(HttpStatus.INTERNAL_SERVER_ERROR, message);
    }
    public static ApiError internalServerError() {
        return error(HttpStatus.INTERNAL_SERVER_ERROR, "internal server error");
    }
    public static ApiError notFound(Throwable t) {
        return error(HttpStatus.NOT_FOUND, t);
    }
    public static ApiError notFound(String message) {
        return error(HttpStatus.NOT_FOUND, message);
    }
    public static ApiError notFound() {
        return error(HttpStatus.NOT_FOUND, "not found");
    }
    public static ApiError notImplemented(Throwable t) {
        return error(HttpStatus.NOT_IMPLEMENTED, t);
    }
    public static ApiError notImplemented(String message) {
        return error(HttpStatus.NOT_IMPLEMENTED, message);
    }
    public static ApiError notImplemented() {
        return error(HttpStatus.NOT_IMPLEMENTED, "not implemented");
    }
    public static ApiError unauthorized(Throwable t) {
        return error(HttpStatus.UNAUTHORIZED, t);
    }
    public static ApiError unauthorized(String message) {
        return error(HttpStatus.UNAUTHORIZED, message);
    }
    public static ApiError unauthorized() {
        return error(HttpStatus.UNAUTHORIZED, "unauthorized");
    }
    public static ApiError unsupportedMediaType(Throwable t) {
        return error(HttpStatus.UNSUPPORTED_MEDIA_TYPE, t);
    }
    public static ApiError unsupportedMediaType(String message) {
        return error(HttpStatus.UNSUPPORTED_MEDIA_TYPE, message);
    }
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


