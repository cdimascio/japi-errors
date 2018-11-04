package io.github.cdimascio.apierrors;

import io.github.cdimascio.apierrors.basic.ApiErrorBasicCreator;
import io.github.cdimascio.apierrors.wcp.ApiErrorWcpCreator;

public class ApiErrorCreator {
    public static final IApiErrorCreator BASIC = new ApiErrorBasicCreator();
    public static final IApiErrorCreator WCP = new ApiErrorWcpCreator();
}
