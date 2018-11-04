package io.github.cdimascio.apierrors.basic;

import io.github.cdimascio.apierrors.AbstractApiError;
import io.github.cdimascio.apierrors.HttpStatus;
import io.github.cdimascio.apierrors.IApiErrorCreator;

public class ApiErrorBasicCreator implements IApiErrorCreator {
    @Override
    public AbstractApiError create(HttpStatus status, String message) {
        return new ApiErrorBasic(status.getCode(), message);
    }

    @Override
    public AbstractApiError create(HttpStatus status, Throwable t) {
        return new ApiErrorBasic(status.getCode(), t.getMessage());
    }
}
