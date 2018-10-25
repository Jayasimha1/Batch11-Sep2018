package com.bell.b11.day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionInroductionDemo {

    public static void main(String[] args){


        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);

        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Yellow");
        color.add("Green");
        color.add("Yellow");
        color.add("White");
        color.add(3,"pink");

        System.out.println(color.contains("White"));
        System.out.println(color.get(3));
        System.out.println(color.isEmpty());
        //String[] arry = (String[])color.toArray();

        ArrayList<String> color2 = new ArrayList<>();
        color2.add("pink");
        color2.add("purpule");
        color2.add("orange");

        color.addAll(color2);

        for(String s:color){
            System.out.println(s);
        }
        System.out.println("****************************************");
        HashSet<String> hs = new HashSet<>();
        hs.add("Red");
        hs.add("Green");
        hs.add("Yellow");
        hs.add("While");
        hs.add("Green");

        for(String s:hs){
            System.out.println(s);
        }

        System.out.println("****************************************");
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Red");
        ts.add("Green");
        ts.add("Yellow");
        ts.add("While");
        ts.add("Green");

        for(String s:ts){
            System.out.println(s);
        }


    }



}
