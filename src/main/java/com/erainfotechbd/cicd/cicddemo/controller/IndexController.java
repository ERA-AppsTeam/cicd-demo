package com.erainfotechbd.cicd.cicddemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("")
    public String getWelcomeMessage(){

        return "Successfully completed CiCd with Jenkin" +
                "1. User GitHub as Source Management" +
                "2. Build Trigger every minutes to check if any commit happen" +
                "3. Pull the source " +
                "4. Build it as a war file using maven" +
                "6. Deploy build war file to tomcat directory" +
                "Finally Build Successful!!! ";
    }
}
