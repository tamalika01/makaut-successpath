package com.mcet.makautsuccesspath.questionpaper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
    public List<Subject> findBySemesterAndBranch(Long semester, String branch);
}
