package com.mcet.makautsuccesspath.questionpaper;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long semester;

    @Column(nullable = false)
    private String branch;

    @Column(nullable = false)
    private String name;
}
