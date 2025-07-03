package com.avnish.designpatterns.behavioral.strategy;

public class CasualStudyStrategy implements ExamStrategy{
    public void prepare(){
        System.out.println("2 months before exam: Casual Study");
    }
}
