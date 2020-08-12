package com.gsean.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProjectName：mypom
 * ClassName：TestController
 * Description：TODO
 * Date：2020/8/11 15:13
 * Author：GSean
 * Version: 1.0
 */
@RestController
public class TestController {
    @Value("${test.str}")
    private String strValue;
    @GetMapping(value = "/test")
    public String test(){
        return "hello pom:"+strValue;
    }


    public static void main(String[] args) {
        System.out.println("sssss");
        System.out.println("sssss");
    }
}
