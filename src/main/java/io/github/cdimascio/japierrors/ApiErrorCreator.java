package io.github.cdimascio.japierrors;

import io.github.cdimascio.japierrors.basic.ApiErrorBasic;
import io.github.cdimascio.japierrors.basic.ApiErrorBasicCreator;
import io.github.cdimascio.japierrors.wcp.ApiErrorWcp;
import io.github.cdimascio.japierrors.wcp.ApiErrorWcpCreator;

public class ApiErrorCreator {
    public static final IApiErrorCreator<ApiErrorBasic> BASIC = new ApiErrorBasicCreator();
    public static final IApiErrorCreator<ApiErrorWcp> WCP = new ApiErrorWcpCreator();
}
