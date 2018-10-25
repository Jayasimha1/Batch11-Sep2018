package com.bell.b11.day5;

public class SimpleInheritance {
    public static void main(String[] args){
        B b1 = new B();
        System.out.println(b1.a);
        System.out.println(b1.b);
        b1.bMtd();
        b1.aMtd();

    }
}

class A{
    int a;
    void aMtd(){
        System.out.println("inside A");
    }

}

class B extends A{
    int b;
    void bMtd(){
        System.out.println("inside B");
    }
}