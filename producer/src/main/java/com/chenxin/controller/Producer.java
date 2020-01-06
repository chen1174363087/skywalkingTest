package com.chenxin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class Producer {
    @GetMapping
    public String producer() {
        System.out.println("received a request");
        return "this message from producer";
    }
}
