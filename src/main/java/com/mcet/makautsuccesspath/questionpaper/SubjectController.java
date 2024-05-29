package com.mcet.makautsuccesspath.questionpaper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.PreparedStatement;
import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    SubjectRepository repository;

    @GetMapping("/subject/{semester}/{branch}")
    public List<Subject> getAllSubject(@PathVariable("semester") Long semester,
                                       @PathVariable("branch") String branch)
    {
        return repository.findBySemesterAndBranch(semester, branch);
    }
}
