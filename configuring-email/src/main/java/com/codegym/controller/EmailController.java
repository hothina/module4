package com.codegym.controller;

import com.codegym.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller

public class EmailController {
    @ModelAttribute("email")
    public Email getEmail() {
        return new Email();
    }

    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    public String showForm(ModelMap model, @ModelAttribute("email") Email email) {
        List<String> listLanguage = new ArrayList<String>();
        listLanguage.add("English");
        listLanguage.add("Vietnames");
        listLanguage.add("Japanes");
        listLanguage.add("Chinese");
        model.addAttribute("listLanguage", listLanguage);

        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(5);
        integerList.add(10);
        integerList.add(15);
        integerList.add(25);
        integerList.add(50);
        integerList.add(100);
        model.addAttribute("listLanguage", listLanguage);
        model.addAttribute("integerList", integerList);
        return "create";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String submit(@ModelAttribute("email") Email email, ModelMap model) {
        model.addAttribute("language", email.getLanguage());
        model.addAttribute("pageSize", email.getPageSize());

        return "info";
    }




}
