package io.github.cdimascio.japierrors;

public abstract class ApiError extends Exception {
    private static IApiErrorCreator error = ApiErrorCreator.BASIC;

    public static void creator(IApiErrorCreator creator) {
        error = creator;
    }
    /**
     * Create a bad request api error using the specified throwable
     * @param t The exceptioo or throwable
     * @return The api error
     */
    public static ApiError badRequest(Throwable t) {
        return error.create(HttpStatus.BAD_REQUEST, t);
    }

    /**
     * Creates a bad request api error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError badRequest(String message) {
        return error.create(HttpStatus.BAD_REQUEST, message);
    }

    /**
     * Creates a bad request api error
     * @return The api error
     */
    public static ApiError badRequest() {
        return error.create(HttpStatus.BAD_REQUEST, "bad request");
    }

    /**
     * Creates a conflict api error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError conflict(Throwable t) {
        return error.create(HttpStatus.CONFLICT, t);
    }

    /**
     * Creates a conflict api error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError conflict(String message) {
        return error.create(HttpStatus.CONFLICT, message);
    }

    /**
     * Creates a conflict error
     * @return The api error
     */
    public static ApiError conflict() {
        return error.create(HttpStatus.CONFLICT, "conflict");
    }

    /**
     * Create a forbidden error using the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError forbidden(Throwable t) {
        return error.create(HttpStatus.FORBIDDEN, t);
    }

    /**
     * Creates a forbidden error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError forbidden(String message) {
        return error.create(HttpStatus.FORBIDDEN, message);
    }

    /**
     * Creates a forbidden error
     * @return The api error
     */
    public static ApiError forbidden() {
        return error.create(HttpStatus.FORBIDDEN, "forbidden");
    }

    /**
     * Create a gateway timeout error using the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError gatewayTimeout(Throwable t) {
        return error.create(HttpStatus.GATEWAY_TIMEOUT, t);
    }

    /**
     * Creates a gateway timeout error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError gatewayTimeout(String message) {
        return error.create(HttpStatus.GATEWAY_TIMEOUT, message);
    }

    /**
     * Creates a gateway timeout error
     * @return The api error
     */
    public static ApiError gatewayTimeout() {
        return error.create(HttpStatus.GATEWAY_TIMEOUT, "gateway timeout");
    }

    /**
     * Create a gone error using the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError gone(Throwable t) {
        return error.create(HttpStatus.GONE, t);
    }

    /**
     * Creates a gone error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError gone(String message) {
        return error.create(HttpStatus.GONE, message);
    }

    /**
     * Creates a gone error
     * @return The api error
     */
    public static ApiError gone() {
        return error.create(HttpStatus.GONE, "gone");
    }

    /**
     * Creates an internal server error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError internalServerError(Throwable t) {
        return error.create(HttpStatus.INTERNAL_SERVER_ERROR, t);
    }

    /**
     * Creates an internal server error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError internalServerError(String message) {
        return error.create(HttpStatus.INTERNAL_SERVER_ERROR, message);
    }

    /**
     * Creates an internal server error
     * @return The api error
     */
    public static ApiError internalServerError() {
        return error.create(HttpStatus.INTERNAL_SERVER_ERROR, "internal server error");
    }

    /**
     * Creates a not acceptable error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError notAcceptable(Throwable t) {
        return error.create(HttpStatus.NOT_ACCEPTABLE, t);
    }
    /**
     * Creates a not acceptable error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError notAcceptable(String message) {
        return error.create(HttpStatus.NOT_ACCEPTABLE, message);
    }

    /**
     * Creates a not acceptable error
     * @return The api error
     */
    public static ApiError notAcceptable() {
        return error.create(HttpStatus.NOT_ACCEPTABLE, "not found");
    }

    /**
     * Creates a not found error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError notFound(Throwable t) {
        return error.create(HttpStatus.NOT_FOUND, t);
    }

    /**
     * Creates a not found error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError notFound(String message) {
        return error.create(HttpStatus.NOT_FOUND, message);
    }

    /**
     * Creates a not found error
     * @return The api error
     */
    public static ApiError notFound() {
        return error.create(HttpStatus.NOT_FOUND, "not found");
    }

    /**
     * Creates a not implemented error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError notImplemented(Throwable t) {
        return error.create(HttpStatus.NOT_IMPLEMENTED, t);
    }

    /**
     * Creates a not implemented error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError notImplemented(String message) {
        return error.create(HttpStatus.NOT_IMPLEMENTED, message);
    }

    /**
     * Creates a not implemented error
     * @return The api error
     */
    public static ApiError notImplemented() {
        return error.create(HttpStatus.NOT_IMPLEMENTED, "not implemented");
    }

    /**
     * Creates a precondition failed error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError preconditionFailed(Throwable t) {
        return error.create(HttpStatus.PRECONDITION_FAILED, t);
    }

    /**
     * Creates a precondition failed error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError preconditionFailed(String message) {
        return error.create(HttpStatus.PRECONDITION_FAILED, message);
    }

    /**
     * Creates a precondition failed error
     * @return The api error
     */
    public static ApiError preconditionFailed() {
        return error.create(HttpStatus.PRECONDITION_FAILED, "precondition failed");
    }

    /**
     * Creates a precondition required error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError preconditionRequired(Throwable t) {
        return error.create(HttpStatus.PRECONDITION_REQUIRED, t);
    }

    /**
     * Creates a precondition required error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError preconditionRequired(String message) {
        return error.create(HttpStatus.PRECONDITION_REQUIRED, message);
    }

    /**
     * Creates a precondition required error
     * @return The api error
     */
    public static ApiError preconditionRequired() {
        return error.create(HttpStatus.PRECONDITION_REQUIRED, "precondition required");
    }

    /**
     * Creates a proxy authentication required error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError proxyAuthenticationRequired(Throwable t) {
        return error.create(HttpStatus.PROXY_AUTHENTICATION_REQUIRED, t);
    }

    /**
     * Creates a proxy authentication required error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError proxyAuthenticationRequired(String message) {
        return error.create(HttpStatus.PROXY_AUTHENTICATION_REQUIRED, message);
    }

    /**
     * Creates a proxy authentication required error
     * @return The api error
     */
    public static ApiError proxyAuthenticationRequired() {
        return error.create(HttpStatus.PROXY_AUTHENTICATION_REQUIRED, "proxy authentication required");
    }

    /**
     * Creates a request entity too large error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError requestEntityTooLarge(Throwable t) {
        return error.create(HttpStatus.REQUEST_ENTITY_TOO_LARGE, t);
    }

    /**
     * Creates a request entity too large error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError requestEntityTooLarge(String message) {
        return error.create(HttpStatus.REQUEST_ENTITY_TOO_LARGE, message);
    }

    /**
     * Creates a request entity too large error
     * @return The api error
     */
    public static ApiError requestEntityTooLarge() {
        return error.create(HttpStatus.NOT_IMPLEMENTED, "not implemented");
    }

    /**
     * Creates a service unavailable error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError serviceUnavailable(Throwable t) {
        return error.create(HttpStatus.SERVICE_UNAVAILABLE, t);
    }

    /**
     * Creates a service unavailable error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError serviceUnavailable(String message) {
        return error.create(HttpStatus.SERVICE_UNAVAILABLE, message);
    }

    /**
     * Creates a service unavailable error
     * @return The api error
     */
    public static ApiError serviceUnavailable() {
        return error.create(HttpStatus.SERVICE_UNAVAILABLE, "service unavailable");
    }

    /**
     * Creates an unauthorized error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError unauthorized(Throwable t) {
        return error.create(HttpStatus.UNAUTHORIZED, t);
    }

    /**
     * Creates an unauthorized error with the specified  message
     * @param message The message
     * @return The api error
     */
    public static ApiError unauthorized(String message) {
        return error.create(HttpStatus.UNAUTHORIZED, message);
    }

    /**
     * Creates an unauthorized error
     * @return The api error
     */
    public static ApiError unauthorized() {
        return error.create(HttpStatus.UNAUTHORIZED, "unauthorized");
    }

    /**
     * Creates an unavailable for legal reasons error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError unavailableForLegalReasons(Throwable t) {
        return error.create(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS, t);
    }

    /**
     * Creates an unavailable for legal reasons error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError unavailableForLegalReasons(String message) {
        return error.create(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS, message);
    }

    /**
     * Creates an unavailable for legal reasons error
     * @return The api error
     */
    public static ApiError unavailableForLegalReasons() {
        return error.create(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS, "unavailable for legal reasons");
    }

    /**
     * Creates an unsupported media type error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError unsupportedMediaType(Throwable t) {
        return error.create(HttpStatus.UNSUPPORTED_MEDIA_TYPE, t);
    }

    /**
     * Creates an unsupported media type error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError unsupportedMediaType(String message) {
        return error.create(HttpStatus.UNSUPPORTED_MEDIA_TYPE, message);
    }

    /**
     * Creates an unsupported media type error
     * @return The api error
     */
    public static ApiError unsupportedMediaType() {
        return error.create(HttpStatus.UNSUPPORTED_MEDIA_TYPE, "unsupported media type");
    }

    /**
     * Creates an upgrade required error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static ApiError upgradeRequired(Throwable t) {
        return error.create(HttpStatus.UPGRADE_REQUIRED, t);
    }

    /**
     * Creates an upgrade required error with the specified message
     * @param message The message
     * @return The api error
     */
    public static ApiError upgradeRequired(String message) {
        return error.create(HttpStatus.UPGRADE_REQUIRED, message);
    }

    /**
     * Creates an upgrade required error
     * @return The api error
     */
    public static ApiError upgradeRequired() {
        return error.create(HttpStatus.UPGRADE_REQUIRED, "upgrade required");
    }
}


