package com.quiz.Service.Impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.quiz.Entities.Entityquiz;
import com.quiz.Service.QuestionClient;
import com.quiz.Service.QuizService;
import com.quiz.repository.Quizrepositary;

@Service
@SuppressWarnings("all")
public class QuizServiceImp implements QuizService {

    private Quizrepositary quizrepo;
    private QuestionClient quesclient;

    public QuizServiceImp(Quizrepositary quizrepo, QuestionClient quesclient) {
        this.quizrepo = quizrepo;
        this.quesclient = quesclient;
    }

    @Override
    public Entityquiz add(Entityquiz quiz) {
            // quizrepo(quiz);
        return quizrepo.save(quiz);
    }

    @Override
    public List<Entityquiz> get() {
       List<Entityquiz> quizzes=quizrepo.findAll();
       List<Entityquiz> newQuiz= quizzes.stream().map(quiz->{
        quiz.setQuestion(quesclient.getQuestionofQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());
        return newQuiz ;
    }

    @Override
    public Entityquiz getbyId(Long id) {
        Entityquiz quiz =quizrepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz Not Found!!"));
       quiz.setQuestion(quesclient.getQuestionofQuiz(quiz.getId()));

        return quiz;

    }

}
