package com.tsf.demo.consumer.fallback;

import com.tsf.demo.consumer.proxy.ProviderDemoService;
import org.springframework.stereotype.Component;

@Component
public class ProviderDemoFallBack implements ProviderDemoService {
    @Override
    public String echo(String str) {
        return "this is feign client provider demo fallback info";
    }
}
