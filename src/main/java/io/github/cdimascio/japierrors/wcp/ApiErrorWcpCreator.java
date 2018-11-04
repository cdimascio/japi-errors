package io.github.cdimascio.japierrors.wcp;

import io.github.cdimascio.japierrors.ApiError;
import io.github.cdimascio.japierrors.HttpStatus;
import io.github.cdimascio.japierrors.IApiErrorCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ApiErrorWcpCreator implements IApiErrorCreator {
    @Override
    public ApiError create(HttpStatus status, String message) {
        final ApiErrorDetails details = new ApiErrorDetails();
        details.code = statusToCode(status);
        details.message = message;

        String trace = UUID.randomUUID().toString();
        List<ApiErrorDetails> errors = new ArrayList<ApiErrorDetails>() {{
            add(details);
        }};
        return new ApiErrorWcp(trace, errors, status);
    }

    @Override
    public ApiError create(HttpStatus status, Throwable t) {
        final ApiErrorDetails details = new ApiErrorDetails();
        details.code = statusToCode(status);
        details.message = t.getMessage(); //.isEmpty() ? status.getReasonPhrase() : t.getMessage();

        String trace = UUID.randomUUID().toString();
        List<ApiErrorDetails> errors = new ArrayList<ApiErrorDetails>() {{
            add(details);
        }};
        return new ApiErrorWcp(trace, errors, status);
    }

    private String statusToCode(HttpStatus status) {
        return status.name().toLowerCase().replace(" ", "_");
    }
}