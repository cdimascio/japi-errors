package io.github.cdimascio.japierrors;

public interface IApiErrorCreator<T extends ApiError> {
    T create(HttpStatus status, String message);
    T create(HttpStatus status, Throwable t);
}