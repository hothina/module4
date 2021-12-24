package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/sandwich/")
public class SandwichController {
    @GetMapping(value = "index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index");
        return modelAndView;
    }

//    @GetMapping("show")
//    public String show(){
//        return "/show";
//    }

    @GetMapping("show")
    public String showById(@RequestParam(defaultValue = "1") int id, Model model){
        System.out.println(id);
        model.addAttribute("id",id);
        return "/show";
    }

    @GetMapping("shows/{id}")
    public String showByIdVariable(@PathVariable int id,Model model){
        model.addAttribute("id",id);
        return "/show";
    }

    @GetMapping("save")
    public String submit(@RequestParam(name = "condimen") String[] condimen, Model model) {
        String s ="abc";
        System.out.println(s);
        model.addAttribute("condimen",condimen);
        return "/show";
    }


}
