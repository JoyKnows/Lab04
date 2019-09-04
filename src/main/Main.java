package main;

import lab04.Person;
import lab04.Student;

public class Main {
    public static void main(String[] args) {
        Person myself = new Person("Joy", 19, 'm');
        Student student = new Student(myself.getName(), myself.getAge(), myself.getGender(), 181540006, 7.35);
        System.out.println(student);


    }
}

