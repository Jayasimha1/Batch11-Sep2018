package com.bell.b11.day2;

public class Student {

    int id;
    double fee;
    String name;

    void display(){

        System.out.println(id);
    }

    int displayNameAndFee(){

        System.out.println(name +" "+fee);
        return 12;
    }

}
