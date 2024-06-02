package com.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.Entities.Entityquiz;

public interface Quizrepositary extends JpaRepository<Entityquiz, Long> {

}