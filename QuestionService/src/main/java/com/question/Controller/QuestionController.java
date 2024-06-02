package com.question.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.Entities.Question;
import com.question.Service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionService ques;

    public QuestionController(QuestionService ques){
        this.ques= ques;

    }
    @GetMapping
    public List<Question> allQues(){
        return ques.getAll();
    }

    @GetMapping("/{id}")
    public Question byId(@PathVariable Long id){
        return ques.getById(id);
    }
    @PostMapping("/{Question}")
    public Question addQues(@RequestBody  Question question){
        return ques.add(question);
    }

    @GetMapping("/quiz/{qid}")
    public List<Question> findByQuizID(@PathVariable Long qid){
        return ques.getbyQuizId(qid);
    }
    
    
}
