package com.mcet.makautsuccesspath.ui.dto;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String contactForm(){
        return "contact";
    }

    @PostMapping("/contact")
    @ResponseBody
    public ResponseEntity<String> handleContactMessage(){
        return ResponseEntity.ok("success");
    }
}
