package io.github.cdimascio.jwcperrors;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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

    public List<ApiErrorDetails> getError() {
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
}


