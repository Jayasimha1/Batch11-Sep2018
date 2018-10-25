package com.bell.b11.day5;

import java.util.EnumMap;

/*
  1. Same method signature
  2. Happens between two classes having inheritance
  3. Return Type should be same
  4. final, static, private methods can't be overriden.
  5. access specifiers should be same as parents or more visibility than parent, same applies for exception & return type

 */
public class Overriding {

    public static void main(String[] args){

        Manager m1 = new Manager();
        System.out.println(m1.salary());

        Clerk c1 = new Clerk();
        System.out.println(c1.salary());

    }

}

class Employee{
     int base = 2000;

       int salary(){
        return base;
    }
}

class Manager extends Employee{

        int salary(){
        return base+30000;
    }

}

class Clerk extends Employee{
    int salary(){
        return base+1000;
    }
}