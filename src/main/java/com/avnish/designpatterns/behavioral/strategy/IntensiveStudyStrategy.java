package com.avnish.designpatterns.behavioral.strategy;

public class IntensiveStudyStrategy implements ExamStrategy{
    public void prepare(){
        System.out.println("1 Week before Exam: Intensive Study");
    }
}
