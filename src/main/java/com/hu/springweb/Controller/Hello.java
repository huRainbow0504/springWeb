package com.hu.springweb.Controller;

import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("/hello")
@RestController
public class Hello {

    @RequestMapping()
    public String hello(){
        return "hello,world";
    }

    @RequestMapping("/again")
    public String helloAgain() {
        return "hello,can you hear me?";
    }
}
