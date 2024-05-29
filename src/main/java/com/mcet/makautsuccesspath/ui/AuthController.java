package com.mcet.makautsuccesspath.ui;

import com.mcet.makautsuccesspath.ui.dto.RegisterRequestDTO;
import com.mcet.makautsuccesspath.user.User;
import com.mcet.makautsuccesspath.user.UserRole;
import com.mcet.makautsuccesspath.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {
    
    @Autowired
    UserService userService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/signup")
    public String signup(){
        return "auth/signup";
    }

    @PostMapping("/signup")
    public String registerUser( RegisterRequestDTO registerRequestDTO){
        User user = new User(registerRequestDTO.firstName, registerRequestDTO.lastName, registerRequestDTO.email, registerRequestDTO.password, true, true, true, true, UserRole.USER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.createUser(user);
        return "auth/signup";
    }

    @GetMapping("/login")
    public String login(){
        return "auth/login";
    }
}
