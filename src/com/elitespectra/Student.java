package com.elitespectra;

import java.util.List;

public class Student {

    private final String name;
    private final String secretNickName = "MySecretNickName";
    private char grade;
    private int group;

    public Student(String name, char grade, int group) throws IllegalArgumentException {

        this.name = name;

        if (List.of('A', 'B', 'C', 'D', 'E', 'F').contains(Character.toUpperCase(grade))) {
            this.grade = Character.toUpperCase(grade);
        } else {
            throw new IllegalArgumentException("Grade can only be 'A', 'B', 'C', 'D', 'E', 'F'");
        }

        if (List.of(1, 2, 3, 4, 5).contains(group)) {
            this.group = group;
        } else {
            throw new IllegalArgumentException("Group can only be 1, 2, 3, 4, 5");
        }

    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public void upgradeStudentGrade() {
        if (this.grade > 'A' && this.grade <= 'F') {
            this.grade--;
        }
    }

    public void downgradeStudentGrade() {
        if (this.grade >= 'A' && this.grade < 'F') {
            this.grade++;
        }
    }

}
