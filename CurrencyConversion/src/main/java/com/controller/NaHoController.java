package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NaHoController {
//    @RequestMapping(value = "/index",method = RequestMethod.GET)
    @GetMapping("/index")
    public String show() {
        return "/index";
    }
}
