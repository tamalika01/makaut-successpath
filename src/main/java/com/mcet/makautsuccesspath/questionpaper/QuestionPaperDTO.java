package com.mcet.makautsuccesspath.questionpaper;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class QuestionPaperDTO {
    private Long id;
    private Long year;
    private String subject_id;
    private String fileName;
}
