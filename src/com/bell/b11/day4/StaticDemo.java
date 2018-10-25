package com.bell.b11.day4;

public class StaticDemo {

    int a;
    static int b;

    public static void main(String[] args){
        StaticDemo sd1 = new StaticDemo();
        sd1.a =10;
        sd1.test();

    }

    public void test(){
        System.out.println("inside non-static");
    }

    public static void display(){
        System.out.println("inside static");
    }

}

class ABC {

    int x ;
    static int y;

    void initialize(int g, int h){
        x =g;
        y = h;
    }

    void display(){
        System.out.println(x + " "+y);
    }

}