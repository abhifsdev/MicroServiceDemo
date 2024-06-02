package com.quiz.Service;

import java.util.List;

import com.quiz.Entities.Entityquiz;

public interface QuizService {

    Entityquiz add(Entityquiz quiz);

    List<Entityquiz> get();

    Entityquiz getbyId(Long id);

}
