package io.github.cdimascio.japierrors;

public interface IApiErrorCreator {
    ApiError create(HttpStatus status, String message);
    ApiError create(HttpStatus status, Throwable t);
}