package com.mcet.makautsuccesspath.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionPaperController {

    @GetMapping("/question")
    public String questionPaperView(){
        return "question-paper";
    }
}
