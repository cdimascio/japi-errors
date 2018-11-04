package io.github.cdimascio.apierrors;

public interface IApiErrorCreator {
    AbstractApiError create(HttpStatus status, String message);
    AbstractApiError create(HttpStatus status, Throwable t);
}