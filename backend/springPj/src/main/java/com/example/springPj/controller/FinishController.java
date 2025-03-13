package com.example.springPj.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.springPj.entity.UsersTable;
import com.example.springPj.mapper.UserMapper;
import com.example.springPj.model.User;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class FinishController {
    @Autowired
    private UserMapper mapper;

    @PostMapping(value = "/commit", params = "commit")
    public String commit(@ModelAttribute User user, Model model) throws ParseException {
        UsersTable table = new UsersTable();
        table.setId(user.getId());
        table.setName(user.getName());
        table.setAge(user.getAge());
        table.setBirthday_date(new java.sql.Date(new SimpleDateFormat("yyyy/mm/dd").parse(user.getBirthday_date()).getTime()));

        mapper.insert(table);

        List<UsersTable> list = mapper.selectById(1);

        model.addAttribute("userTable", list.get(0));

        return "finish";
    }

    @PostMapping(value = "/commit", params = "back")
    public String back(@ModelAttribute User user, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("user", user);

        return "redirect:/form";
    }
}
