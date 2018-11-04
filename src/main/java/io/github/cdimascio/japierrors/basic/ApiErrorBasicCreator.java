package io.github.cdimascio.japierrors.basic;


import io.github.cdimascio.japierrors.ApiError;
import io.github.cdimascio.japierrors.HttpStatus;
import io.github.cdimascio.japierrors.IApiErrorCreator;

public class ApiErrorBasicCreator implements IApiErrorCreator {
    @Override
    public ApiError create(HttpStatus status, String message) {
        return new ApiErrorBasic(status.getCode(), message);
    }

    @Override
    public ApiError create(HttpStatus status, Throwable t) {
        return new ApiErrorBasic(status.getCode(), t.getMessage());
    }
}
