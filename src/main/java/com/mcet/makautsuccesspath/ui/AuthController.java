package com.mcet.makautsuccesspath.ui;

import com.mcet.makautsuccesspath.ui.dto.RegisterRequestDTO;
import com.mcet.makautsuccesspath.user.User;
import com.mcet.makautsuccesspath.user.UserRole;
import com.mcet.makautsuccesspath.user.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView registerUser(@Valid RegisterRequestDTO registerRequestDTO,
                                     BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView("auth/signup");
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("errors", bindingResult.getAllErrors());
            return modelAndView;
        }
        if(!registerRequestDTO.password.equals(registerRequestDTO.password2)){
            bindingResult.addError(new FieldError("password", "password", "Both Password field are not same"));
            modelAndView.addObject("errors", bindingResult.getAllErrors());
            return modelAndView;
        }
        if(userService.userExists(registerRequestDTO.email)){
            bindingResult.addError(new FieldError("Email Exist", "Email Registered", "This email is already registered"));
            modelAndView.addObject("errors", bindingResult.getAllErrors());
            return modelAndView;
        }
        User user = new User(registerRequestDTO.firstName, registerRequestDTO.lastName, registerRequestDTO.email, registerRequestDTO.password, true, true, true, true, UserRole.USER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.createUser(user);
        modelAndView.addObject("success","Account Created Successfully, Please Login to continue");
        return modelAndView;
    }

    @GetMapping("/login")
    public String login(){
        return "auth/login";
    }
}
