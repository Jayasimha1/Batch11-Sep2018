package com.bell.b11.day19;


import java.util.ArrayList;
//https://docs.oracle.com/javase/tutorial/java/generics/types.html
public class GenericsDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Red");
        al.add("Green");
        al.add("Yellow");
        display(al);

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(20);
        al2.add(30);
        al2.add(40);
        al2.add(50);

        display(al2);

    }

    private static void display(ArrayList<? extends Object> x){

        for(Object o:x){
            System.out.println(o);
        }

    }

}


