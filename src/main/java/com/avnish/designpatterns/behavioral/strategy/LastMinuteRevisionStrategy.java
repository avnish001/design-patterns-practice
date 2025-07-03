package com.avnish.designpatterns.behavioral.strategy;

public class LastMinuteRevisionStrategy implements ExamStrategy{
    public void prepare(){
        System.out.println("1 day before exam: Last minute revision");
    }
}
