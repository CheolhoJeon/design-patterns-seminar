package com.charlie.week3.OnlineCourse.start;

public class Application {

    public static void main(String[] args) {
        OnlineCourse databaseCourse = new OnlineCourse("데이터베이스");

        Student mong = new Student("이몽룡");
        Student gil = new Student("홍길동");

        databaseCourse.addStudent(mong);

        databaseCourse.changeState(OnlineCourse.State.PRIVATE);

        gil.addPrivateCourse(databaseCourse);
        databaseCourse.addStudent(gil);

        databaseCourse.addReview("hello", mong);

        System.out.println(databaseCourse);
    }
}
