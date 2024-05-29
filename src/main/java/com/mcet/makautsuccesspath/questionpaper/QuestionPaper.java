package com.mcet.makautsuccesspath.questionpaper;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class QuestionPaper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long year;

    @ManyToOne(fetch=FetchType.LAZY)
    Subject subject;

    @Column(nullable = false, unique = true)
    private String fileName;
}
