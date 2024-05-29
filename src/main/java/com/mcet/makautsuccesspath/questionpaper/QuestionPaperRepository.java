package com.mcet.makautsuccesspath.questionpaper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionPaperRepository extends JpaRepository<QuestionPaper, Long> {

    @Query("FROM QuestionPaper q WHERE q.year = :year AND q.subject.id = :subjectId")
    List<QuestionPaper> findByYearAndSubject(Long year, String subjectId);
}
