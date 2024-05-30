package com.mcet.makautsuccesspath.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticController {

    @GetMapping("/placement")
    public String getPlacement(){
        return "redirect:/placement/index.html";
    }

    @GetMapping("/about")
    public String about(){
        return "redirect:/about/about.html";
    }
}
