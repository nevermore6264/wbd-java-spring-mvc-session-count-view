package com.codegym.controller;

import com.codegym.model.MyCount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("mycount")
public class CountController {

    /* add MyCounter in model attribute */
    @ModelAttribute("mycount")
    public MyCount setUpCounter() {
        return new MyCount();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("mycount") MyCount myCount) {
        myCount.increment();
        return "index";
    }
}