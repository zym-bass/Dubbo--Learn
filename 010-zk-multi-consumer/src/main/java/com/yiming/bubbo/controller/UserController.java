package com.yiming.bubbo.controller;

import com.yiming.entity.User;
import com.yiming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService1;

    @Autowired
    private UserService userService2;

    @RequestMapping(value = "/userDetail")
    public String userDetail(Model model, Integer id , String username ){
        User user1 = userService1.queryUserById(id, username);
        User user2 = userService2.queryUserById(id, username);

        model.addAttribute("user1",user1);
        model.addAttribute("user2",user2);
        return "userDetail";
    }
}
