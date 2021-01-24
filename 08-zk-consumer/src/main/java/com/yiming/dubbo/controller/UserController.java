package com.yiming.dubbo.controller;

import com.yiming.entity.User;
import com.yiming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userDetail")
    public String userDetail(Model model,Integer id,String username){
        User user = userService.queryUserById(id,username);
        model.addAttribute("user",user);
        return "userDetail";
    }
}
