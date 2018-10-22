package io.github.cdimascio.jwcperrors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiErrorDetails {
    @JsonProperty
    String code;
    @JsonProperty
    String message;

}
