package oop.associations.ushtrime;

public class CourseDemo {
    public static void main(String[] args) {
        Professor p1 = new Professor("Naim", "Sulejmani");
        Professor p2 = new Professor("Gzim", "Ciriku");

        Course oop = new Course("OOP", "Object Oriented Programming", p1);
        Course mtm = new Course("MTM", "Mathematics", p1);

        p1.addCourse(oop);
        p1.addCourse(mtm);

        Student s1 = new Student(1, "Ardita", "Shabani");
        Student s2 = new Student(2, "Art", "Selimi");
        Student s3 = new Student(3, "Priam", "Zogu");

        oop.enrollStudent(s1);
        oop.enrollStudent(s2);
        oop.enrollStudent(s3);

        mtm.enrollStudent(s2);
        mtm.enrollStudent(s3);

        oop.print();


    }
}
