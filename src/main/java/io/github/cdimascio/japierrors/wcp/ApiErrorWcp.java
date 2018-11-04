package io.github.cdimascio.japierrors.wcp;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.cdimascio.japierrors.ApiError;
import io.github.cdimascio.japierrors.HttpStatus;

import java.util.List;

@JsonAutoDetect(
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        creatorVisibility = JsonAutoDetect.Visibility.NONE
)
@JsonIgnoreProperties
public class ApiErrorWcp extends ApiError {
    @JsonProperty
    private String trace;
    @JsonProperty
    private List<ApiErrorDetails> errors;
    @JsonIgnore
    private HttpStatus status;

    private ApiErrorWcp() {
        super();
    }

    /**
     * A general api error
     * @param trace A UUID that uniquely identifies this api error instance
     * @param errors A list of error details
     * @param status The http error status accompanying this error
     */
    public ApiErrorWcp(String trace, List<ApiErrorDetails> errors, HttpStatus status) {
        this.trace = trace;
        this.errors = errors;
        this.status = status;
    }

    /**
     * Returns the uuid for this ApiError
     * @return The ApiError
     */
    public String getTrace() {
        return trace;
    }

    /**
     * Returns the list of errors for this ApiError
     * @return The ApiError
     */
    public List<ApiErrorDetails> getErrors() {
        return this.errors;
    }

    /**
     * Returns the http status for this ApiError
     * @return The ApiError
     */
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
