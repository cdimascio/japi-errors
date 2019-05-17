package io.github.cdimascio.japierrors;

@SuppressWarnings("unchecked")
public abstract class ApiError extends Exception {
    private static IApiErrorCreator error = ApiErrorCreator.BASIC;

    /**
     * @param creator the api creator instance e.g ApiErrorBasicCreator
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     */
    public static <T extends ApiError> void creator(IApiErrorCreator<T> creator) {
        error = creator;
    }

    private static <T extends ApiError> IApiErrorCreator<T> getCreator() {
        return error;
    }

    /**
     * Create a bad request api error using the specified throwable
//     * @param T The type of ApiError
     * @param t The exceptioo or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T badRequest(Throwable t) {
        return (T) error.create(HttpStatus.BAD_REQUEST, t);
    }

    /**
     * Creates a bad request api error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static  <T extends ApiError> T badRequest(String message) {
        return (T) error.create(HttpStatus.BAD_REQUEST, message);
    }

    /**
     * Creates a bad request api error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static  <T extends ApiError> T badRequest() {
        return (T) error.create(HttpStatus.BAD_REQUEST, "bad request");
    }

    /**
     * Creates a conflict api error with the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T conflict(Throwable t) {
        return (T) error.create(HttpStatus.CONFLICT, t);
    }

    /**
     * Creates a conflict api error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T conflict(String message) {
        return (T) error.create(HttpStatus.CONFLICT, message);
    }

    /**
     * Creates a conflict error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T conflict() {
        return (T) error.create(HttpStatus.CONFLICT, "conflict");
    }

    /**
     * Create a forbidden error using the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T forbidden(Throwable t) {
        return (T) error.create(HttpStatus.FORBIDDEN, t);
    }

    /**
     * Creates a forbidden error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T forbidden(String message) {
        return (T) error.create(HttpStatus.FORBIDDEN, message);
    }

    /**
     * Creates a forbidden error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T forbidden() {
        return (T) error.create(HttpStatus.FORBIDDEN, "forbidden");
    }

    /**
     * Create a gateway timeout error using the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T gatewayTimeout(Throwable t) {
        return (T) error.create(HttpStatus.GATEWAY_TIMEOUT, t);
    }

    /**
     * Creates a gateway timeout error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T gatewayTimeout(String message) {
        return (T) error.create(HttpStatus.GATEWAY_TIMEOUT, message);
    }

    /**
     * Creates a gateway timeout error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T gatewayTimeout() {
        return (T) error.create(HttpStatus.GATEWAY_TIMEOUT, "gateway timeout");
    }

    /**
     * Create a gone error using the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T gone(Throwable t) {
        return (T) error.create(HttpStatus.GONE, t);
    }

    /**
     * Creates a gone error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T gone(String message) {
        return (T) error.create(HttpStatus.GONE, message);
    }

    /**
     * Creates a gone error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T gone() {
        return (T) error.create(HttpStatus.GONE, "gone");
    }

    /**
     * Creates an internal server error with the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T internalServerError(Throwable t) {
        return (T) error.create(HttpStatus.INTERNAL_SERVER_ERROR, t);
    }

    /**
     * Creates an internal server error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T internalServerError(String message) {
        return (T) error.create(HttpStatus.INTERNAL_SERVER_ERROR, message);
    }

    /**
     * Creates an internal server error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T internalServerError() {
        return (T) error.create(HttpStatus.INTERNAL_SERVER_ERROR, "internal server error");
    }

    /**
     * Creates a not acceptable error with the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T notAcceptable(Throwable t) {
        return (T) error.create(HttpStatus.NOT_ACCEPTABLE, t);
    }
    /**
     * Creates a not acceptable error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T notAcceptable(String message) {
        return (T) error.create(HttpStatus.NOT_ACCEPTABLE, message);
    }

    /**
     * Creates a not acceptable error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T notAcceptable() {
        return (T) error.create(HttpStatus.NOT_ACCEPTABLE, "not found");
    }

    /**
     * Creates a not found error with the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T notFound(Throwable t) {
        return (T) error.create(HttpStatus.NOT_FOUND, t);
    }

    /**
     * Creates a not found error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T notFound(String message) {
        return (T) error.create(HttpStatus.NOT_FOUND, message);
    }

    /**
     * Creates a not found error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T notFound() {
        return (T) error.create(HttpStatus.NOT_FOUND, "not found");
    }

    /**
     * Creates a not implemented error with the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T notImplemented(Throwable t) {
        return (T) error.create(HttpStatus.NOT_IMPLEMENTED, t);
    }

    /**
     * Creates a not implemented error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T notImplemented(String message) {
        return (T) error.create(HttpStatus.NOT_IMPLEMENTED, message);
    }

    /**
     * Creates a not implemented error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T notImplemented() {
        return (T) error.create(HttpStatus.NOT_IMPLEMENTED, "not implemented");
    }

    /**
     * Creates a precondition failed error with the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T preconditionFailed(Throwable t) {
        return (T) error.create(HttpStatus.PRECONDITION_FAILED, t);
    }

    /**
     * Creates a precondition failed error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T preconditionFailed(String message) {
        return (T) error.create(HttpStatus.PRECONDITION_FAILED, message);
    }

    /**
     * Creates a precondition failed error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T preconditionFailed() {
        return (T) error.create(HttpStatus.PRECONDITION_FAILED, "precondition failed");
    }

    /**
     * Creates a precondition required error with the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T preconditionRequired(Throwable t) {
        return (T) error.create(HttpStatus.PRECONDITION_REQUIRED, t);
    }

    /**
     * Creates a precondition required error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T preconditionRequired(String message) {
        return (T) error.create(HttpStatus.PRECONDITION_REQUIRED, message);
    }

    /**
     * Creates a precondition required error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T preconditionRequired() {
        return (T) error.create(HttpStatus.PRECONDITION_REQUIRED, "precondition required");
    }

    /**
     * Creates a proxy authentication required error with the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T proxyAuthenticationRequired(Throwable t) {
        return (T) error.create(HttpStatus.PROXY_AUTHENTICATION_REQUIRED, t);
    }

    /**
     * Creates a proxy authentication required error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T proxyAuthenticationRequired(String message) {
        return (T) error.create(HttpStatus.PROXY_AUTHENTICATION_REQUIRED, message);
    }

    /**
     * Creates a proxy authentication required error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T proxyAuthenticationRequired() {
        return (T) error.create(HttpStatus.PROXY_AUTHENTICATION_REQUIRED, "proxy authentication required");
    }

    /**
     * Creates a request entity too large error with the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T requestEntityTooLarge(Throwable t) {
        return (T) error.create(HttpStatus.REQUEST_ENTITY_TOO_LARGE, t);
    }

    /**
     * Creates a request entity too large error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T requestEntityTooLarge(String message) {
        return (T) error.create(HttpStatus.REQUEST_ENTITY_TOO_LARGE, message);
    }

    /**
     * Creates a request entity too large error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T requestEntityTooLarge() {
        return (T) error.create(HttpStatus.NOT_IMPLEMENTED, "not implemented");
    }

    /**
     * Creates a service unavailable error with the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T serviceUnavailable(Throwable t) {
        return (T) error.create(HttpStatus.SERVICE_UNAVAILABLE, t);
    }

    /**
     * Creates a service unavailable error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T serviceUnavailable(String message) {
        return (T) error.create(HttpStatus.SERVICE_UNAVAILABLE, message);
    }

    /**
     * Creates a service unavailable error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T serviceUnavailable() {
        return (T) error.create(HttpStatus.SERVICE_UNAVAILABLE, "service unavailable");
    }

    /**
     * Creates a too many requests error with the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T tooManyRequests(Throwable t) {
        return (T) error.create(HttpStatus.TOO_MANY_REQUESTS, t);
    }

    /**
     * Creates a too many requests error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T tooManyRequests(String message) {
        return (T) error.create(HttpStatus.TOO_MANY_REQUESTS, message);
    }

    /**
     * Creates a too many requests error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T tooManyRequests() {
        return (T) error.create(HttpStatus.TOO_MANY_REQUESTS, "too many requests");
    }

    /**
     * Creates an unauthorized error with the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T unauthorized(Throwable t) {
        return (T) error.create(HttpStatus.UNAUTHORIZED, t);
    }

    /**
     * Creates an unauthorized error with the specified  message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T unauthorized(String message) {
        return (T) error.create(HttpStatus.UNAUTHORIZED, message);
    }

    /**
     * Creates an unauthorized error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T unauthorized() {
        return (T) error.create(HttpStatus.UNAUTHORIZED, "unauthorized");
    }

    /**
     * Creates an unavailable for legal reasons error with the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T unavailableForLegalReasons(Throwable t) {
        return (T) error.create(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS, t);
    }

    /**
     * Creates an unavailable for legal reasons error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T unavailableForLegalReasons(String message) {
        return (T) error.create(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS, message);
    }

    /**
     * Creates an unavailable for legal reasons error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T unavailableForLegalReasons() {
        return (T) error.create(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS, "unavailable for legal reasons");
    }

    /**
     * Creates an unsupported media type error with the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T unsupportedMediaType(Throwable t) {
        return (T) error.create(HttpStatus.UNSUPPORTED_MEDIA_TYPE, t);
    }

    /**
     * Creates an unsupported media type error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T unsupportedMediaType(String message) {
        return (T) error.create(HttpStatus.UNSUPPORTED_MEDIA_TYPE, message);
    }

    /**
     * Creates an unsupported media type error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T unsupportedMediaType() {
        return (T) error.create(HttpStatus.UNSUPPORTED_MEDIA_TYPE, "unsupported media type");
    }

    /**
     * Creates an upgrade required error with the specified exception or throwable
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T upgradeRequired(Throwable t) {
        return (T) error.create(HttpStatus.UPGRADE_REQUIRED, t);
    }

    /**
     * Creates an upgrade required error with the specified message
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T upgradeRequired(String message) {
        return (T) error.create(HttpStatus.UPGRADE_REQUIRED, message);
    }

    /**
     * Creates an upgrade required error
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T upgradeRequired() {
        return (T) error.create(HttpStatus.UPGRADE_REQUIRED, "upgrade required");
    }

    /**
     * Creates an upgrade required error with the specified exception or throwable
     * @param code the status code
     * @param t The exception or throwable
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T error(int code, Throwable t) {
        return (T) error.create(HttpStatus.fromCode(code), t);
    }

    /**
     * Creates an upgrade required error with the specified message
     * @param code the status code
     * @param message The message
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T error(int code, String message) {
        return (T) error.create(HttpStatus.fromCode(code), message);
    }

    /**
     * Creates an upgrade required error
     * @param code the status code
     * @param <T> The type of ApiError e.g. ApiErrorBasic
     * @return The api error
     */
    public static <T extends ApiError> T error(int code) {
        return (T) error.create(HttpStatus.fromCode(code), "error");
    }
}


