package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Caculators {
    @GetMapping("/submit")
    public String index() {
        return "index";
    }
}
