package com.hueiying.lab.bankapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String Hello() {
        // 回傳Hello World字串
        return "Hello World";
    }
}
