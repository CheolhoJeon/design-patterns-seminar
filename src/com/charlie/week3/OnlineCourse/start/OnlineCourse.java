package com.charlie.week3.OnlineCourse.start;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {

    private String name;
    private State state = State.DRAFT;
    private List<String> reviews = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public enum State {
        DRAFT, PUBLISHED, PRIVATE
    }

    public OnlineCourse(final String name) {
        this.name = name;
    }

    public void addReview(String review, Student student) {
        if (this.state == State.PUBLISHED) {
            this.reviews.add(review);
        } else if (this.state == State.PRIVATE && this.students.contains(student)) {
            this.reviews.add(review);
        } else {
            throw new UnsupportedOperationException("리뷰를 작성할 수 없습니다.");
        }
    }

    public void addStudent(Student student) {
        if (this.state == State.DRAFT || this.state == State.PUBLISHED) {
            this.students.add(student);
        } else if (this.state == State.PRIVATE && availableTo(student)) {
            this.students.add(student);
        } else {
            throw new UnsupportedOperationException("학생을 해당 수업에 추가할 수 없습니다.");
        }
    }

    public void changeState(State newState) {
        this.state = newState;
    }

    private boolean availableTo(Student student) {
        return student.isEnabledForPrivateClass(this);
    }

    @Override
    public String toString() {
        return "OnlineCourse{" +
            "name='" + name + '\'' +
            ", state=" + state +
            ", reviews=" + reviews +
            ", students=" + students +
            '}';
    }
}
