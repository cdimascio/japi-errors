package io.github.cdimascio.japierrors.basic;

import io.github.cdimascio.japierrors.HttpStatus;
import io.github.cdimascio.japierrors.IApiErrorCreator;

public class ApiErrorBasicCreator implements IApiErrorCreator<ApiErrorBasic> {
    @Override
    public ApiErrorBasic create(HttpStatus status, String message) {
        return new ApiErrorBasic(status.getCode(), message);
    }

    @Override
    public ApiErrorBasic create(HttpStatus status, Throwable t) {
        return new ApiErrorBasic(status.getCode(), t.getMessage());
    }
}
