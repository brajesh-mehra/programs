package com.bm.aks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpResponse;

@RestController
@RequestMapping("/api/")
public class HelloController {

    @GetMapping("hello")
    public String greeting(HttpServletRequest request){
        System.out.println("Request Path: "+ request.getServerName());
        return "Hello";
    }
}
