package com.quiz.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.Entities.Entityquiz;
import com.quiz.Service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {


	
    private QuizService service;
    public QuizController(QuizService service) {
        this.service=service;
	}
    //create
    @PostMapping
    public Entityquiz create(@RequestBody Entityquiz quiz){
        return service.add(quiz);
    }
    //get ALL
    @GetMapping
    public List<Entityquiz> getall(){
        return service.get();
    }
    //get by id 
    @GetMapping("/{id}")
    public Entityquiz getById(@PathVariable Long id){
        return service.getbyId(id);
    }
}
