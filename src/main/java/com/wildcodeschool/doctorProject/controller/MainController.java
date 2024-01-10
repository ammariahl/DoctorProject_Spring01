package com.wildcodeschool.doctorProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class
MainController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String indexDoctor1() {
        return "William Hartnell";
    }
    @GetMapping("/doctor/10")
    @ResponseBody
    public String indexDoctor10() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String indexDoctor13() {
        return "Jodie Whittaker";
    }
}
