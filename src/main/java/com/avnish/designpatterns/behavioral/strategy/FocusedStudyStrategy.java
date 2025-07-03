package com.avnish.designpatterns.behavioral.strategy;

public class FocusedStudyStrategy implements ExamStrategy{
    public void prepare(){
        System.out.println("One Month Before Exam: Focused Study");
    }
}
