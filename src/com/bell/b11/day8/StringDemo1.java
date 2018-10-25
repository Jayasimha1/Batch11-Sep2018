package com.bell.b11.day8;

public class StringDemo1 {

    public static void main(String[] args){


        String str = "This is a java & java class";
        String str1 = "THIS IS A JAVA & JAVA CLASS";



        System.out.println(str.equals(str1));

        String name1 ="Suresh";
        String name2 = "Suresh";
        String name3 = new String("Suresh");
        String name4 = new String("Suresh");
        String name5 = "Kumar";

       if(name1.equals(name2)){
            System.out.println("equal");
        } else{
            System.out.println("not equal");
        }

        if(name1.equals(name5)){
            System.out.println("equal");
        } else{
            System.out.println("not equal");
        }      if(name1==name2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        if(name3==name4){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        if(name1==name5){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

    }
}

