package oop.associations.ushtrime;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Course {
    private final String id;
    private String name;
    private static final int MAX_STUDENTS = 50;
    //    private Student[] enrolledStudents = new Student[MAX_STUDENTS];
//    private int enrolledStudentsCount = 0;
    private ArrayList<Student> enrolledStudents = new ArrayList<>(MAX_STUDENTS);
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
//        enrolledStudents[enrolledStudentsCount++] = student;
        enrolledStudents.add(student);
    }

    public int freeSeats() {
        //return MAX_STUDENTS - enrolledStudents;
        return MAX_STUDENTS - enrolledStudents.size();
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
//        for (int i = 0; i < enrolledStudentsCount; i++) {
//            var student = enrolledStudents[i];
//            System.out.printf("%d. %s %s%n", student.getId(), student.getName(), student.getSurname());
//        }
        for (Student student : enrolledStudents) {
            System.out.printf("%d. %s %s%n", student.getId(), student.getName(), student.getSurname());
        }
        System.out.println("-------------------------------------");
        System.out.println("Total students registered: " + enrolledStudents.size() );
        System.out.println("-------------------------------------");
        System.out.println("Printed date and time: " + LocalDateTime.now());
        System.out.println("-------------------------------------");
    }


}











