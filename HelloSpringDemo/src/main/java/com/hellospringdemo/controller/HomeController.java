package com.hellospringdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ssubraveti on 4/27/16.
 */

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "home";
    }
}
