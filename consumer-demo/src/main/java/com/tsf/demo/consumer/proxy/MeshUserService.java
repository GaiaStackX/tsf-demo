package com.tsf.demo.consumer.proxy;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "provider-demo-mesh")
public interface MeshUserService {
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    String user();
}
