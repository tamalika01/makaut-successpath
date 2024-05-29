package com.mcet.makautsuccesspath.questionpaper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/question")
public class QuestionPaperAPI {

    @Autowired
    QuestionPaperRepository repository;

    @GetMapping("/{subject_id}")
    List<QuestionPaperDTO> getAllQuestionPaperOfSubject(@PathVariable("subject_id") Long subject_id)
    {
        List<QuestionPaper> questionPapers = repository.getAllBySubject(subject_id);
        List<QuestionPaperDTO> ans = new ArrayList<>(questionPapers.size());
        for(QuestionPaper questionPaper :questionPapers)
            ans.add(new QuestionPaperDTO(questionPaper.getId(), questionPaper.getYear(), subject_id, questionPaper.getFileName()));
        return ans;
    }
}
