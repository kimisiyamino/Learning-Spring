package com.eleonoralion.spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/h")
    public String hello(){
        return "hello_world"; // Возвращаем представление
    }
}
