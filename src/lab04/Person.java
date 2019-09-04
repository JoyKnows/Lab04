package lab04;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        Scanner sc = new Scanner(System.in);
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder response=new StringBuilder();
        response.append("Hello, my name is " + getName() + " I am a " + getGender() + " and I am " + getAge() + " years old.");
        return response.toString();
    }
}

class Main {
    public static void main(String[] args) {
        Person myself = new Person("Joy", 19, 'm');
        System.out.println(myself);
    }
}
