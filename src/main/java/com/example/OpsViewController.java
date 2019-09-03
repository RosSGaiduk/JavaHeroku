package com.example;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class OpsViewController {

    @RequestMapping("/requestdata")
    public String displayLoginPage(HttpServletRequest request){
        System.out.println("Request" + new Gson().toJson(request));
        return "login";
    }
}
