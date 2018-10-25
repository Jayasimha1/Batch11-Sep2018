package com.bell.b11.day5;

/*
  Over loading can be achieved by
  1. Same method name
  2. But different args (type of arg, order of arg, number of arg)
  3. happens with in the same class
 */
public class OverloadingDemo {
    public static void main(String[] args){
        Addition a1 = new Addition();
        a1.add(10, 20, "Raj");
        a1.add(10,20,50);
       // a1.add(10,20);
        main(10);
    }

    public static void main(int x){
        System.out.println("x value in overlaoded main method"+ x);

    }
}

class Addition{


    static void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    void add(int a, int b, String name){
        System.out.println("Hey "+ name + " result is "+ (a+b));
    }


}