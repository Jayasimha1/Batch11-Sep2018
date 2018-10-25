package com.bell.b11.day8.exceptions;

import java.util.Scanner;

public class Scenario2 {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = 0;
        int x[] = {10,20,30};
        try {
            c = a / b;
            System.out.println("Division "+c);

        }catch(ArithmeticException e){
            System.out.println("Your division is having a problem, fix it");
        }

        try{
            System.out.println(x[5]);
            System.out.println("I execute only when there is no exception above me");
        }finally {
            System.out.println("I always executes ");
        }

        int d = a*b;

        System.out.println();

        System.out.println("Multiply"+d);

    }
}
