package com.bell.b11.day3;

import java.util.Scanner;

public class ArraysDemo {

    public static void main(String[] args){

        int[] arry1 = new int[4];
        int arry2[] = {1,4,5,6,7};

        System.out.println(arry2.length);
        for(int i=0; i< arry2.length; i++){
            System.out.println(i + " "+arry2[i]);
        }


        String[] names = new String[5];
        Scanner scan = new Scanner(System.in);

        for(int j=0; j< names.length; j++){
            names[j] =scan.next();
        }

        for(int x=0; x<names.length; x++){
            System.out.print(names[x] + " ");
        }

        for(String s:names){
            System.out.println(s);
        }

    }
}
