package io.github.cdimascio.apierrors.wcp;

import io.github.cdimascio.apierrors.AbstractApiError;
import io.github.cdimascio.apierrors.HttpStatus;
import io.github.cdimascio.apierrors.IApiErrorCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ApiErrorWcpCreator implements IApiErrorCreator {
    @Override
    public AbstractApiError create(HttpStatus status, String message) {
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
    public AbstractApiError create(HttpStatus status, Throwable t) {
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