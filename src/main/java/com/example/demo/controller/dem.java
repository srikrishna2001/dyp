package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dem {
    @GetMapping("/abc")
    public  String abd()
    {
        return  "this is demo app";
    }

}
