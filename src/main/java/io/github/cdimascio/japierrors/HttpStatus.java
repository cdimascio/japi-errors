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

    public static HttpStatus fromCode(int code) {
        switch(code) {
            case 400: return BAD_REQUEST;
            case 409: return CONFLICT;
            case 403: return FORBIDDEN;
            case 504: return GATEWAY_TIMEOUT;
            case 410: return GONE;
            case 500: return INTERNAL_SERVER_ERROR;
            case 406: return NOT_ACCEPTABLE;
            case 404: return NOT_FOUND;
            case 501: return NOT_IMPLEMENTED;
            case 412: return PRECONDITION_FAILED;
            case 428: return PRECONDITION_REQUIRED;
            case 407: return PROXY_AUTHENTICATION_REQUIRED;
            case 413: return REQUEST_ENTITY_TOO_LARGE;
            case 503: return SERVICE_UNAVAILABLE;
            case 401: return UNAUTHORIZED;
            case 451: return UNAVAILABLE_FOR_LEGAL_REASONS;
            case 415: return UNSUPPORTED_MEDIA_TYPE;
            case 426: return UPGRADE_REQUIRED;
            default: throw new IllegalArgumentException("unknown status code " +code);
        }
    }
    @Override
    public String toString() {
        return "HttpStatus{" +
                "code=" + code +
                ", description='" + description + '\'' +
                '}';
    }
}
