package sem3hw;

import java.io.Serializable;

class Student implements Serializable {
    String name;
    int age;
    transient double GPA; //transient не дает сериализоваться и десериализоваться

    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + GPA);
    }
}