package oop.class_summary.detyra;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {

    }

    public Person(String name, int age, String gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
        setName(name);
        setAge(age);
        setGender(gender);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid Age");
            return;
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (!(gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F"))) {
            System.out.println("Invalid Gender");
            return;
        }
        this.gender = gender;
    }

    public boolean isTeenager() {
//        if( age <= 18) {
//            return true;
//        } else {
//            return false;
//        }

//        if (age > 18)
//            return false;
//        return true;

//        return age <= 18 ? true :false;

        return age >= 13 && age <= 18;

    }

    public boolean isRetired() {
        return age >= 65; // operator i krahasimit
    }

    public void whoIAm() {
        System.out.printf("I am %s -> %s, %d years old %n", name, gender, age);
    }
}













