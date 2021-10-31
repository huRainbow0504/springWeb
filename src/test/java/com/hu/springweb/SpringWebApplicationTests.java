package com.hu.springweb;

import com.hu.springweb.Controller.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringWebApplicationTests {

    Hello hello = new Hello();
    @Test
    void contextLoads() {
    }

    void controller_hello(){
        String actual = hello.hello();

        assertEquals("hello,world", actual);
    }

}
