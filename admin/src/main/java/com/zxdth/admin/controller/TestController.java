package com.zxdth.admin.controller;


import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zxdth.utils.helper.CommonMethod;

@RestController
@RequestMapping("/Test")
public class TestController {

    @GetMapping("/time")
    public String getTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format( CommonMethod.getTime());
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }
}
