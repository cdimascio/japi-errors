package io.github.cdimascio.apierrors;

public class ApiError extends AbstractApiError {
    private static IApiErrorCreator error = ApiErrorCreator.BASIC;

    public static void creator(IApiErrorCreator creator) {
        error = creator;
    }
    /**
     * Create a bad request api error using the specified throwable
     * @param t The exceptioo or throwable
     * @return The api error
     */
    public static AbstractApiError badRequest(Throwable t) {
        return error.create(HttpStatus.BAD_REQUEST, t);
    }

    /**
     * Creates a bad request api error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError badRequest(String message) {
        return error.create(HttpStatus.BAD_REQUEST, message);
    }

    /**
     * Creates a bad request api error
     * @return The api error
     */
    public static AbstractApiError badRequest() {
        return error.create(HttpStatus.BAD_REQUEST, "bad request");
    }

    /**
     * Creates a conflict api error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError conflict(Throwable t) {
        return error.create(HttpStatus.CONFLICT, t);
    }

    /**
     * Creates a conflict api error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError conflict(String message) {
        return error.create(HttpStatus.CONFLICT, message);
    }

    /**
     * Creates a conflict error
     * @return The api error
     */
    public static AbstractApiError conflict() {
        return error.create(HttpStatus.CONFLICT, "conflict");
    }

    /**
     * Create a forbidden error using the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError forbidden(Throwable t) {
        return error.create(HttpStatus.FORBIDDEN, t);
    }

    /**
     * Creates a forbidden error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError forbidden(String message) {
        return error.create(HttpStatus.FORBIDDEN, message);
    }

    /**
     * Creates a forbidden error
     * @return The api error
     */
    public static AbstractApiError forbidden() {
        return error.create(HttpStatus.FORBIDDEN, "forbidden");
    }

    /**
     * Create a gateway timeout error using the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError gatewayTimeout(Throwable t) {
        return error.create(HttpStatus.GATEWAY_TIMEOUT, t);
    }

    /**
     * Creates a gateway timeout error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError gatewayTimeout(String message) {
        return error.create(HttpStatus.GATEWAY_TIMEOUT, message);
    }

    /**
     * Creates a gateway timeout error
     * @return The api error
     */
    public static AbstractApiError gatewayTimeout() {
        return error.create(HttpStatus.GATEWAY_TIMEOUT, "gateway timeout");
    }

    /**
     * Create a gone error using the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError gone(Throwable t) {
        return error.create(HttpStatus.GONE, t);
    }

    /**
     * Creates a gone error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError gone(String message) {
        return error.create(HttpStatus.GONE, message);
    }

    /**
     * Creates a gone error
     * @return The api error
     */
    public static AbstractApiError gone() {
        return error.create(HttpStatus.GONE, "gone");
    }

    /**
     * Creates an internal server error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError internalServerError(Throwable t) {
        return error.create(HttpStatus.INTERNAL_SERVER_ERROR, t);
    }

    /**
     * Creates an internal server error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError internalServerError(String message) {
        return error.create(HttpStatus.INTERNAL_SERVER_ERROR, message);
    }

    /**
     * Creates an internal server error
     * @return The api error
     */
    public static AbstractApiError internalServerError() {
        return error.create(HttpStatus.INTERNAL_SERVER_ERROR, "internal server error");
    }

    /**
     * Creates a not acceptable error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError notAcceptable(Throwable t) {
        return error.create(HttpStatus.NOT_ACCEPTABLE, t);
    }
    /**
     * Creates a not acceptable error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError notAcceptable(String message) {
        return error.create(HttpStatus.NOT_ACCEPTABLE, message);
    }

    /**
     * Creates a not acceptable error
     * @return The api error
     */
    public static AbstractApiError notAcceptable() {
        return error.create(HttpStatus.NOT_ACCEPTABLE, "not found");
    }

    /**
     * Creates a not found error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError notFound(Throwable t) {
        return error.create(HttpStatus.NOT_FOUND, t);
    }

    /**
     * Creates a not found error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError notFound(String message) {
        return error.create(HttpStatus.NOT_FOUND, message);
    }

    /**
     * Creates a not found error
     * @return The api error
     */
    public static AbstractApiError notFound() {
        return error.create(HttpStatus.NOT_FOUND, "not found");
    }

    /**
     * Creates a not implemented error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError notImplemented(Throwable t) {
        return error.create(HttpStatus.NOT_IMPLEMENTED, t);
    }

    /**
     * Creates a not implemented error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError notImplemented(String message) {
        return error.create(HttpStatus.NOT_IMPLEMENTED, message);
    }

    /**
     * Creates a not implemented error
     * @return The api error
     */
    public static AbstractApiError notImplemented() {
        return error.create(HttpStatus.NOT_IMPLEMENTED, "not implemented");
    }

    /**
     * Creates a precondition failed error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError preconditionFailed(Throwable t) {
        return error.create(HttpStatus.PRECONDITION_FAILED, t);
    }

    /**
     * Creates a precondition failed error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError preconditionFailed(String message) {
        return error.create(HttpStatus.PRECONDITION_FAILED, message);
    }

    /**
     * Creates a precondition failed error
     * @return The api error
     */
    public static AbstractApiError preconditionFailed() {
        return error.create(HttpStatus.PRECONDITION_FAILED, "precondition failed");
    }

    /**
     * Creates a precondition required error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError preconditionRequired(Throwable t) {
        return error.create(HttpStatus.PRECONDITION_REQUIRED, t);
    }

    /**
     * Creates a precondition required error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError preconditionRequired(String message) {
        return error.create(HttpStatus.PRECONDITION_REQUIRED, message);
    }

    /**
     * Creates a precondition required error
     * @return The api error
     */
    public static AbstractApiError preconditionRequired() {
        return error.create(HttpStatus.PRECONDITION_REQUIRED, "precondition required");
    }

    /**
     * Creates a proxy authentication required error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError proxyAuthenticationRequired(Throwable t) {
        return error.create(HttpStatus.PROXY_AUTHENTICATION_REQUIRED, t);
    }

    /**
     * Creates a proxy authentication required error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError proxyAuthenticationRequired(String message) {
        return error.create(HttpStatus.PROXY_AUTHENTICATION_REQUIRED, message);
    }

    /**
     * Creates a proxy authentication required error
     * @return The api error
     */
    public static AbstractApiError proxyAuthenticationRequired() {
        return error.create(HttpStatus.PROXY_AUTHENTICATION_REQUIRED, "proxy authentication required");
    }

    /**
     * Creates a request entity too large error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError requestEntityTooLarge(Throwable t) {
        return error.create(HttpStatus.REQUEST_ENTITY_TOO_LARGE, t);
    }

    /**
     * Creates a request entity too large error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError requestEntityTooLarge(String message) {
        return error.create(HttpStatus.REQUEST_ENTITY_TOO_LARGE, message);
    }

    /**
     * Creates a request entity too large error
     * @return The api error
     */
    public static AbstractApiError requestEntityTooLarge() {
        return error.create(HttpStatus.NOT_IMPLEMENTED, "not implemented");
    }

    /**
     * Creates a service unavailable error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError serviceUnavailable(Throwable t) {
        return error.create(HttpStatus.SERVICE_UNAVAILABLE, t);
    }

    /**
     * Creates a service unavailable error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError serviceUnavailable(String message) {
        return error.create(HttpStatus.SERVICE_UNAVAILABLE, message);
    }

    /**
     * Creates a service unavailable error
     * @return The api error
     */
    public static AbstractApiError serviceUnavailable() {
        return error.create(HttpStatus.SERVICE_UNAVAILABLE, "service unavailable");
    }

    /**
     * Creates an unauthorized error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError unauthorized(Throwable t) {
        return error.create(HttpStatus.UNAUTHORIZED, t);
    }

    /**
     * Creates an unauthorized error with the specified  message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError unauthorized(String message) {
        return error.create(HttpStatus.UNAUTHORIZED, message);
    }

    /**
     * Creates an unauthorized error
     * @return The api error
     */
    public static AbstractApiError unauthorized() {
        return error.create(HttpStatus.UNAUTHORIZED, "unauthorized");
    }

    /**
     * Creates an unavailable for legal reasons error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError unavailableForLegalReasons(Throwable t) {
        return error.create(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS, t);
    }

    /**
     * Creates an unavailable for legal reasons error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError unavailableForLegalReasons(String message) {
        return error.create(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS, message);
    }

    /**
     * Creates an unavailable for legal reasons error
     * @return The api error
     */
    public static AbstractApiError unavailableForLegalReasons() {
        return error.create(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS, "unavailable for legal reasons");
    }

    /**
     * Creates an unsupported media type error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError unsupportedMediaType(Throwable t) {
        return error.create(HttpStatus.UNSUPPORTED_MEDIA_TYPE, t);
    }

    /**
     * Creates an unsupported media type error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError unsupportedMediaType(String message) {
        return error.create(HttpStatus.UNSUPPORTED_MEDIA_TYPE, message);
    }

    /**
     * Creates an unsupported media type error
     * @return The api error
     */
    public static AbstractApiError unsupportedMediaType() {
        return error.create(HttpStatus.UNSUPPORTED_MEDIA_TYPE, "unsupported media type");
    }

    /**
     * Creates an upgrade required error with the specified exception or throwable
     * @param t The exception or throwable
     * @return The api error
     */
    public static AbstractApiError upgradeRequired(Throwable t) {
        return error.create(HttpStatus.UPGRADE_REQUIRED, t);
    }

    /**
     * Creates an upgrade required error with the specified message
     * @param message The message
     * @return The api error
     */
    public static AbstractApiError upgradeRequired(String message) {
        return error.create(HttpStatus.UPGRADE_REQUIRED, message);
    }

    /**
     * Creates an upgrade required error
     * @return The api error
     */
    public static AbstractApiError upgradeRequired() {
        return error.create(HttpStatus.UPGRADE_REQUIRED, "upgrade required");
    }
}


