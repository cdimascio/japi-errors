package io.github.cdimascio.japierrors;

import io.github.cdimascio.japierrors.basic.ApiErrorBasicCreator;
import io.github.cdimascio.japierrors.wcp.ApiErrorWcpCreator;

public class ApiErrorCreator {
    public static final IApiErrorCreator BASIC = new ApiErrorBasicCreator();
    public static final IApiErrorCreator WCP = new ApiErrorWcpCreator();
}
