package io.github.cdimascio.japierrors.wcp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiErrorDetails {
    @JsonProperty
    String code;
    @JsonProperty
    String message;

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "ApiErrorDetails{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
