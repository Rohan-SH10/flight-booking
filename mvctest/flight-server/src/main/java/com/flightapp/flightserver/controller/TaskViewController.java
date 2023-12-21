package com.flightapp.flightserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskViewController {
    @GetMapping("/")
    public String helloWorld(){
        return "test-view";
    }
}
