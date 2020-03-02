package com.sid.companyservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lhouceine OUHAMZA
 */
@RefreshScope
@RestController
public class CompanyRestController {

    @Value("${me}")
    private String me;

    @GetMapping("/params")
    public Map<String, Object> myConfig(){
        Map<String, Object> params = new HashMap<>();
        params.put("me", me);
        params.put("Thread",Thread.currentThread().getName());
        return params;
    }
}
