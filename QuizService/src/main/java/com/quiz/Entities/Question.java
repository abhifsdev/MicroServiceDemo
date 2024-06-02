package com.quiz.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    
    private Long lId;
    private String question;
    private Long quizId;
    
}
