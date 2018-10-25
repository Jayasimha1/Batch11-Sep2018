package com.bell.b11.day5;

public class MultilevelInheritance {
    public static void main(String[] args){
        C1 c1 = new C1();/*
        System.out.println(c1.a);
        System.out.println(c1.b);
        c1.bMtd();
        c1.aMtd();*/

    }
}

class A1{
    int a;
    A1(){
        System.out.println("Inside A1 con");
    }
    void aMtd(){
        System.out.println("inside A");
    }

}

class B1 extends A1{
    int b;
    B1(){
        System.out.println("Inside B1 con");
    }
    void bMtd(){
        System.out.println("inside B");
    }
}

class C1 extends B1{
    int c;
    C1(){
        System.out.println("Inside C1 con");
    }
    void cMtd(){
        System.out.println("inside C");
    }

}