package com.liu.liu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 121
 * @Date: 2021/7/13 10:28
 * @Description: 
 */
@RestController
public class TestController {
@GetMapping("/hi")
    public String sayHi(){
        return "hi";
    }

}
