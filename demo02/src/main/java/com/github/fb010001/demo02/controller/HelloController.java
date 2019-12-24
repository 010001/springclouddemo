package com.github.fb010001.demo02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *@Title ${TODO}
 *＠author    fangbin
 *@Date 19-12-24 下午1:15
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }
}
