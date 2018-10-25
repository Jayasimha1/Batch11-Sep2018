package com.bell.b11.day5;

public class HerrachiacalInheritance {
    public static void main(String[] args){
        C2 c2 = new C2();


    }
}

class A2{
     private int a;
    A2(){
        System.out.println("Inside A1 con");
    }
    private void aMtd(){
        System.out.println("inside A");
    }

}

class B2 extends A2{
    int b;
    B2(){
        System.out.println("Inside B1 con");
    }
    void bMtd(){
        System.out.println("inside B");
    }
}

class C2 extends A2{
    int c;
    C2(){
        System.out.println("Inside C1 con");
    }
    void cMtd(){
        System.out.println("inside C");
    }

}