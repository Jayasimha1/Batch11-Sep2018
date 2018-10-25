package com.bell.b11.day3;

public class AptDemo {

    public static void main(String args[]){

        Apartments apt1 = new Apartments();
        apt1.number=121;
        apt1.name ="dulles";
        apt1.cost =1275.00;
        int number = apt1.getAptDetails();
       double val = apt1.getRentAmount();
        System.out.println(val);
        System.out.println(number);


    }

}

class Apartments {

    int number;
    double cost;
    String name;


    int getAptDetails(){
        return number;
    }

    double getRentAmount(){
        cost = cost+100;
        return cost;
    }

}
