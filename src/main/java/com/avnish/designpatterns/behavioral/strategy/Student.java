package com.avnish.designpatterns.behavioral.strategy;

public class Student {
    private ExamStrategy examStrategy;

    public void setExamStrategy(ExamStrategy examStrategy){
        this.examStrategy=examStrategy;
    }

    public void prepareForExam(){
        examStrategy.prepare();
    }
}
