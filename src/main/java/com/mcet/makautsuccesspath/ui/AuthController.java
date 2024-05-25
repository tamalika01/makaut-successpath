package com.mcet.makautsuccesspath.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/signup")
    public String signup(){
        return "auth/signup";
    }

    @GetMapping("/login")
    public String login(){
        return "auth/login";
    }

    @GetMapping("/logout")
    public String logout(){
        return "auth/logout";
    }
}
