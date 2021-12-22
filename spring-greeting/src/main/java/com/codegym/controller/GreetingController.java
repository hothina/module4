package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class GreetingController {

    @GetMapping("/converter")
    public String index() {
        return "index";
    }

    @PostMapping("/convert")
    public ModelAndView submit(@RequestParam double usd, double rate) {
        ModelAndView modelAndView = new ModelAndView("submit");
        double  vnd = usd*rate;
        modelAndView.addObject("usd",usd);
        modelAndView.addObject("rate",rate);
        modelAndView.addObject("vnd",vnd);
        return modelAndView;
    }

}

