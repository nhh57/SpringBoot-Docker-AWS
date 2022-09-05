package com.example.springbootdockeraws.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
    @RequestMapping("")
    public String index(){
        return "Nguyễn Hoàng Hải Dep Trai";
    }

    @RequestMapping("/index")
    public String aaaa(){
        return "Nguyễn Hoàng Hải Dep 22222";
    }
}
