package com.springcloud.clientb.controller;


import com.springcloud.clientb.service.ServiceARemoteAPI;
import com.springcloud.clientb.service.ServiceBRemoteAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ClientController {

    @Autowired
    ServiceARemoteAPI serviceARemoteAPI;

    @Autowired
    ServiceBRemoteAPI serviceBRemoteAPI;



    public Object getFallbackA() {

        return "getFallbackA error";
    }

    @RequestMapping("/feignInvoke/servicea")
    @ResponseBody
    public String feignInvokeServiceA(){

        String result = serviceARemoteAPI.feignInvokeServiceA();
        return result;
    }


    @RequestMapping("/feignInvoke/serviceb")
    @ResponseBody
    public String feignInvokeServiceB(){

        String result = serviceBRemoteAPI.feignInvokeServiceB();
        return result;
    }



    @RequestMapping("/feignInvoke/servicea/add")
    @ResponseBody
    public Integer feignInvokeServiceAAdd(){

        Integer result = serviceARemoteAPI.invokeAdd(1,2);
        return result;
    }


    @RequestMapping("/feignInvoke/serviceb/add")
    @ResponseBody
    public Integer feignInvokeServiceBAdd(){

         Integer result = serviceBRemoteAPI.invokeAdd(5,6);
         return result;
    }

}
