package com.system.lld.exception;

import java.util.Map;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.webflux.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;

@Component
public class GlobalErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(
            ServerRequest request,
            ErrorAttributeOptions options) {

        Map<String, Object> map = super.getErrorAttributes(request, options);

        map.put("status", map.get("status"));
        map.put("message", map.get("error"));

        return map;
    }
}
