package com.question.Service.Implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.Entities.Question;
import com.question.Repository.QuestionRepository;
import com.question.Service.QuestionService;

@Service
@SuppressWarnings("all")
public class QuestionserviceImpl implements QuestionService{

    private QuestionRepository quesrepo;

	public QuestionserviceImpl(QuestionRepository quesrepo) {
        this.quesrepo=quesrepo;
	}
    

    @Override
    public List<Question> getAll() {
        return quesrepo.findAll();
    }

    @Override
    public Question getById(Long id) {
        return quesrepo.findById(id).orElseThrow(()-> new RuntimeException("No Question Found!!"));
    }

    @Override
    public Question add(Question ques) {
        return quesrepo.save(ques);
    }


    @Override
    public List<Question> getbyQuizId(Long quizId) {
        return quesrepo.findByQuizId(quizId);
        
    }
    
}
