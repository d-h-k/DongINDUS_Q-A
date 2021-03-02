package com.codessquad.qna.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {



    @GetMapping("/helloworld")
    public String welcome(String name,int age, Model model) {
        System.out.println("name : " + name + "age : " + age + "Model : " + model);
        model.addAttribute("name",name);
        return "welcome";
    }
}
