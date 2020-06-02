package com.projects.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Collections;

public class LambdajavaAPI implements RequestHandler<Object,GatewayResponse> {
    @Override
    public GatewayResponse handleRequest(Object object, Context context) {

        String message="Hello From Kumar";
        System.out.println(message);

        GatewayResponse response=new GatewayResponse(
                message,
                200,
                Collections.singletonMap("X-Powered By","Kumar"),
                false
        );
        return response;
    }
}
