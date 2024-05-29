package com.mcet.makautsuccesspath.ui;

import com.mcet.makautsuccesspath.user.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(@AuthenticationPrincipal User user){
        if(user==null){
            return "index";
        }
        return "home";
    }
}
