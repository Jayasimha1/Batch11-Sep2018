package com.bell.b11.day4;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        System.out.println("Please provide the count");
        int count = scan.nextInt();

        int[] userData = new int[count];

        for(int k=0; k<userData.length;k++){

            System.out.println("Give me "+ k +" number");
            userData[k] = scan.nextInt();
        }

        System.out.println("Thank You!! Let me process");

        for(int j=0; j<userData.length; j++){
            boolean isPrime = true;
            int number = userData[j];
            if(number<2){
                isPrime = false;
            }
            for(int i=2; i<number; i++){
                if(number%i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(number +" is prime");
            }


        }



    }

}
