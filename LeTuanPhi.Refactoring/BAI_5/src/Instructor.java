/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KHOA PC
 */

    
    class Person {
    String Id;
    String name;

    public Person() {
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return Integer.parseInt(Id);
    }

    public String getName() {
        return name;
    }
}

class Instructor extends Person {
    int yearOfExp;

    public Instructor() {
    }

    public int getSalary() {
        return 1;
    }
}

class Student extends Person {
    String ClassName;

    public Student() {
    }

    public int getScholarship() {
        return 1;
    }
}

