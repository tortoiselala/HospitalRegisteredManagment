package com.tortoiselala.controller;

import com.tortoiselala.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class LoginController {

    /**
     * login
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@ModelAttribute("user") User usr){
        return "home";
    }
}
