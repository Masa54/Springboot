package com.example.springPj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.springPj.model.User;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {
    
    @GetMapping("/form")
    public String readFrom(@ModelAttribute User user) {
        return "form";
    }
    

    @PostMapping("/form")
    public String confirm(@ModelAttribute User user, Model model) {
        
        if (user.getAge() < 0) {
            user.setErrMsg("年齢の値が不正です");

            model.addAttribute("message", "エラーです");

            return "folder/irregular";
        }

        return "confirm";
    }
}
