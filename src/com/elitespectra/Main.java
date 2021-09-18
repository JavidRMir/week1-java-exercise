package com.elitespectra;

public class Main {

    public static void main(String[] args) {

        Student john = new Student("John Doe", 'C', 5);
        System.out.println(john.getName() + " " + john.getGrade());

        john.upgradeStudentGrade();
        System.out.println(john.getName() + " " + john.getGrade());

        john.downgradeStudentGrade();
        System.out.println(john.getName() + " " + john.getGrade());
    }
}
