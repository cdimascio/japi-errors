package io.github.cdimascio.japierrors.basic;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.cdimascio.japierrors.ApiError;

import java.util.Objects;

@JsonAutoDetect(
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        isGetterVisibility = JsonAutoDetect.Visibility.NONE,
        creatorVisibility = JsonAutoDetect.Visibility.NONE
)
public class ApiErrorBasic extends ApiError {
    @JsonProperty
    private String error;
    @JsonProperty
    private Integer code;

    ApiErrorBasic() {
        super();
    }

    ApiErrorBasic(Integer code, String error) {
        this.code = code;
        this.error = error;
    }

    public String getError() {
        return this.error;
    }

    public int getCode() {
        return this.code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApiErrorBasic that = (ApiErrorBasic) o;
        return Objects.equals(error, that.error) &&
                Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, code);
    }

    @Override
    public String toString() {
        return "ApiErrorBasic{" +
                "error='" + error + '\'' +
                ", code=" + code +
                '}';
    }
}
