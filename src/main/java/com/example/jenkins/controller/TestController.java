package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuwei
 * @create 2021-07-06 22:03
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get")
    public String test(){
        return "测试返回";
    }
}
