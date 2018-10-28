package com.bell.b11.day18;

public class StaticDemo {

    static int a =0;

    StaticDemo sd = new StaticDemo();

    StaticDemo(){
        System.out.println("I'm inside Constructor");
    }

    public static void main(String[] args) {
        System.out.println("I'm inside main method");
    }


    static{
        System.out.println("I'm inside static block");
    }
}
