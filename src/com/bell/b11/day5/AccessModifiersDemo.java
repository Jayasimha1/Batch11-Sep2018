package com.bell.b11.day5;

public class AccessModifiersDemo {

    Car cobj1 = new Car("tesla",30000);

    public static void main(){

    }
}


 class Car{

    private String  model;
    protected int cost;
    int year;
    public static String make;


    private Car(){
        System.out.println("I'm inside default const");
    }

     Car(String model, int cost){
        System.out.println("I'm inside arg const");
        this.model = model;
        this.cost = cost;
    }

     void display(){
        int value =200;
        System.out.println("I'm display method");
        System.out.println(model);

    }

}