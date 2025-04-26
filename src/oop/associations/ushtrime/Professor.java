package oop.associations.ushtrime;

public class Professor {
    private static int nextId = 1;
    private final int id;

    private String name;
    private String surname;
    private Course[] courses;
    private int courseCount;
    private static final int MAX_COURSES = 20;


    public Professor(String name, String surname) {
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void addCourse(Course course) {
        if (courseCount >= MAX_COURSES) {
            System.out.println("Professor has reached the maximum number of courses!");
            return;
        }
        courses[courseCount++] = course;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public void print() {
        System.out.println("ID: " + id);
        System.out.printf("Professor name: %s %s%n", name, surname);
        System.out.println("Courses: ");
        for (int i = 0; i < courseCount; i++) {
            var course = courses[i];
            course.print();
            System.out.println("\n\n");
        }
        System.out.println("==================================");
        System.out.println("Total courses: " + courseCount);
        System.out.println("==================================");
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%s,%d", id, name, surname, courseCount);
    }
}
