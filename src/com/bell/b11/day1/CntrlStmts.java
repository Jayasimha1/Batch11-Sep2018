package com.bell.b11.day1;

public class CntrlStmts {



    public static void main(String[] args){

        int marks = 05;

        if(marks >= 80){
            System.out.println("Student got A-Grade");
        }
        else if(marks<80 && marks>=60){
            System.out.println("Student got B-grade");
        }
        else if(marks<60 && marks>=35){
            System.out.println("Student got C-grade");
        }
        else{
            System.out.println("Student failed.");
        }


        for(int i=1;i<=5; i++){
            for(int j=1; j<=10; j++){

                System.out.println(i+" * "+j+" = "+i*j);
            }

        }


        int amount =9;

        while(amount<=10){
            System.out.println(amount);
            amount++;
        }
        System.out.println("I'm out from while");

        int amount2 =9;
        do{
            System.out.println("Inside do-while "+amount2);
            amount2++;
        }while(amount2<=10);


    }


}
