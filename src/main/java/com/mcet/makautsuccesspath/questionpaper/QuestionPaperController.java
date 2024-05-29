package com.mcet.makautsuccesspath.questionpaper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuestionPaperController {

    @Autowired
    QuestionPaperRepository repository;

    @GetMapping("/question/{year}/{subject_id}")
    List<QuestionPaperDTO> getAllQuestionPaperInAYear(@PathVariable("year") Long year,
                                                   @PathVariable("subject_id") String subject_id)
    {
        List<QuestionPaper> questionPapers = repository.findByYearAndSubject(year, subject_id);
        List<QuestionPaperDTO> ans = new ArrayList<>(questionPapers.size());
        for(QuestionPaper questionPaper :questionPapers)
            ans.add(new QuestionPaperDTO(questionPaper.getId(), questionPaper.getYear(), subject_id, questionPaper.getFileName()));
        return ans;
    }
}
