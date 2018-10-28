package com.bell.b11.day17;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsExtractionDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("India");
        al.add("China");
        al.add("Pakistan");
        al.add("Usa");
        al.add("Russia");
        al.add("WestIndies");

        System.out.println("***********Using Traditional for loop****************");
        for(int i=0; i<al.size();i++){
            System.out.println(al.get(i));
        }
        System.out.println("********* For each ******************");
        for(String s:al){
            System.out.println(s);
        }

        System.out.println("**************Using Iterator*************");
        Iterator<String> it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }

}
