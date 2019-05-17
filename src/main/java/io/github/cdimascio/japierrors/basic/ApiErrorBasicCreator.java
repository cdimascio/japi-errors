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
        String message = t.getMessage();
        if (message == null || message.isEmpty()) {
            message = HttpStatus.fromCode(status.getCode()).getDescription();
        }
        return new ApiErrorBasic(status.getCode(), message);
    }
}
