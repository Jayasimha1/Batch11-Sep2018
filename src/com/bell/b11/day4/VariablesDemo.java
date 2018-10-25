package com.bell.b11.day4;

public class VariablesDemo {

    //Instance variable
    int a;
    static int x;
    Student s1 = new Student();

    public static void main(String[] args){

        VariablesDemo vd1 = new VariablesDemo();
        vd1.test();

    }

    public void test(){
        //Local variable / Method variable
        //Local varaible must be initailized else it will give you a complilation error
        int c =10;
        Student s2  = new Student();
        System.out.println(a);
        System.out.println(s1);
        test2();
    }

    public void test2(){
        System.out.println("in test2");
    }

}

class Student{
    int id;
    String name;


}