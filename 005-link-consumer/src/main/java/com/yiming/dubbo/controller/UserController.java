package com.yiming.dubbo.controller;

import com.yiming.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
    @RequestMapping(value = "/userDetail")
    public String userDetail(Model model ,Integer id){
        User user = new User();
        user.setUserName("张三");
        user.setAge(100);
        user.setId(id);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
