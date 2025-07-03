package com.avnish.designpatterns.behavioral.strategy;

public class ExamPreparationDemo {
    public static void main(String[] args) {
        Student student = new Student();

        // 2 months before the exam
        student.setExamStrategy(new CasualStudyStrategy());
        student.prepareForExam();

        // 1 month before the exam
        student.setExamStrategy(new FocusedStudyStrategy());
        student.prepareForExam();

        // 1 week before the exam
        student.setExamStrategy(new IntensiveStudyStrategy());
        student.prepareForExam();

        // 1 day before the exam
        student.setExamStrategy(new LastMinuteRevisionStrategy());
        student.prepareForExam();
    }
}
