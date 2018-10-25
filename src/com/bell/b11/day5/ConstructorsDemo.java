package com.bell.b11.day5;

public class ConstructorsDemo {

     public static void main(String[] args){

         Student s1 = new Student(10, "Raj");

         Student s2 = new Student();
         s2.id = 20;
         s2.name ="simha";
     }
}


class Student{

    int id;
    String name;

    Student(){
        System.out.println("This is my Default Constructor");
    }

    Student(int no, String fullname){
        System.out.println("This is my argument constructor");
        id = no;
        name = fullname;
    }

    void display(){
        System.out.println("Hey I'm a Student class");
    }



}