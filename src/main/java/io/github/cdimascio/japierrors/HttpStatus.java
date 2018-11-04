package io.github.cdimascio.japierrors;


public enum HttpStatus {
    BAD_REQUEST(400, "bad request"),
    CONFLICT(409, "conflict"),
    FORBIDDEN(403, "forbidden"),
    GATEWAY_TIMEOUT(504, "gateway timeout"),
    GONE(410, "gone"),
    INTERNAL_SERVER_ERROR(500, "internal server error"),
    NOT_ACCEPTABLE(406, "not acceptable"),
    NOT_FOUND(404, "not found"),
    NOT_IMPLEMENTED(501, "not implemented"),
    PRECONDITION_FAILED(412, "precondition failed"),
    PRECONDITION_REQUIRED(428, "precondition required"),
    PROXY_AUTHENTICATION_REQUIRED(407, "proxy authentication required"),
    REQUEST_ENTITY_TOO_LARGE(413, "request entity too large"),
    SERVICE_UNAVAILABLE(503, "service unavailable"),
    UNAUTHORIZED(401, "unauthorized"),
    UNAVAILABLE_FOR_LEGAL_REASONS(451, "unavailable for legal reasons"),
    UNSUPPORTED_MEDIA_TYPE(415, "unsupported media type"),
    UPGRADE_REQUIRED(426, "upgrade required");

    private final int code;
    private final String description;

    HttpStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * Returns http status code for this error
     * @return An integer representing http status code
     */
    public int getCode() {
        return this.code;
    }

    /**
     * The http status description
     * @return The api description
     */
    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "HttpStatus{" +
                "code=" + code +
                ", description='" + description + '\'' +
                '}';
    }
}
