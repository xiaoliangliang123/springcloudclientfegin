package com.springcloud.clientb.service;


import org.springframework.stereotype.Component;

@Component
public class FallbackMethod implements  ServiceARemoteAPI{
    public String feignInvokeServiceA() {
        return "servicea";
    }

    public Integer invokeAdd(int a, int b) {
        return a+b;
    }
}
