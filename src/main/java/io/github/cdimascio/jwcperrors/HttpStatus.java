package io.github.cdimascio.jwcperrors;


public enum HttpStatus {
    BAD_REQUEST(400, "bad request"),
    CONFLICT(409, "conflict"),
    FORBIDDEN(403, "forbidden"),
    INTERNAL_SERVER_ERROR(500, "internal server error"),
    NOT_FOUND(404, "not found"),
    NOT_IMPLEMENTED(501, "not implemented"),
    UNAUTHORIZED(401, "unauthorized"),
    UNSUPPORTED_MEDIA_TYPE(415, "unsupported media type");
    private final int code;
    private final String description;

    HttpStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return this.code;
    }

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
