package com.hu.springweb.Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/userinfo")
@RestController
public class UserMessage {

    @RequestMapping("/userInfo")
    public String userMessage(){
        return "This is user massage.";
    }

}
