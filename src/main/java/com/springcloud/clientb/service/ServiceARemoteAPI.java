package com.springcloud.clientb.service;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Component
@FeignClient(name = "eureka-service-a" )
public interface ServiceARemoteAPI {

    @GetMapping("/invoke")
    String feignInvokeServiceA();

    @RequestMapping("/invokeAdd")
    Integer invokeAdd(@RequestParam("a") final int a, @RequestParam("b") final int b);
}
