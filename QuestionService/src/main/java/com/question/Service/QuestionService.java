package com.question.Service;

import java.util.List;

import com.question.Entities.Question;

public interface QuestionService {
    List<Question> getAll();

    Question getById(Long id);

    Question add(Question ques);

    List<Question> getbyQuizId(Long quizId);

}
