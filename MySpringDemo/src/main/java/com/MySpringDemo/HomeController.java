package com.MySpringDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ssubraveti on 5/13/16.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "home";
    }
}
