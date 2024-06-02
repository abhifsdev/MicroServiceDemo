package com.quiz.Service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.Entities.Question;

@FeignClient(name = "QuestionService")
// @FeignClient(url = "http://localhost:8084/", value = "Question-Client")
public interface QuestionClient {

    //
    @GetMapping("question/quiz/{quizid}")
    List<Question> getQuestionofQuiz(@PathVariable Long quizid);

}
