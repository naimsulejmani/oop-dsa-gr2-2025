package oop.associations.ushtrime;

import java.time.LocalDateTime;

public class Course {
    private final String id;
    private String name;
    private static final int MAX_STUDENTS = 50;
    private Student[] enrolledStudents = new Student[MAX_STUDENTS];
    private int enrolledStudentsCount = 0;
    private Professor professor;


    public Course(String id, String name, Professor professor) {
        this.id = id;
        this.name = name;
        this.professor = professor;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void enrollStudent(Student student) {
        if (!hasFreeSeats()) { //enrolledStudentsCount >= MAX_STUDENTS
            System.out.println("Course is fulL! No more free seats!");
            return;
        }
        enrolledStudents[enrolledStudentsCount++] = student;
    }

    public int freeSeats() {
        return MAX_STUDENTS - enrolledStudentsCount;
    }

    public boolean hasFreeSeats() {
        return freeSeats() > 0;
    }

    public void print() {
        System.out.println("ID: " + id);
        System.out.println("Course name: " + name);
        System.out.println("Free seats: " + freeSeats());
        System.out.println("Course professor:" + professor.getName() + " " + professor.getSurname());
        System.out.println("Enrolled students:");
        System.out.println("-------------------------------------");
        for (int i = 0; i < enrolledStudentsCount; i++) {
            var student = enrolledStudents[i];
            System.out.printf("%d. %s %s%n", student.getId(), student.getName(), student.getSurname());
        }
        System.out.println("-------------------------------------");
        System.out.println("Total students registered: " + enrolledStudentsCount);
        System.out.println("-------------------------------------");
        System.out.println("Printed date and time: " + LocalDateTime.now());
        System.out.println("-------------------------------------");
    }


}











