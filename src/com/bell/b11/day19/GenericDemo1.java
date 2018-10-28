package com.bell.b11.day19;

import java.util.ArrayList;

public class GenericDemo1 {

    public static void main(String[] args) {

          Bucket<Integer> b = new Bucket<>();
          b.setA(10);
          //b.setA(20);

        System.out.println(b.getA());

         Bucket<String> bucket1 = new Bucket<>();
         bucket1.setA("New");
         bucket1.setA("Me Too");
        System.out.println(bucket1.getA());



    }
}

class Bucket<T>{

    private T a;

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }
}
