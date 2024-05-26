package com.mcet.makautsuccesspath.ui;

import com.mcet.makautsuccesspath.ui.dto.RegisterRequestDTO;
import com.mcet.makautsuccesspath.user.User;
import com.mcet.makautsuccesspath.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {
    
    @Autowired
    UserService userService;

    @GetMapping("/signup")
    public String signup(){
        return "auth/signup";
    }

    @PostMapping("/signup")
    public String registerUser( RegisterRequestDTO registerRequestDTO){
        System.out.println(registerRequestDTO);
        userService.registerNewUser(registerRequestDTO);
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
