package com.bell.b11.day5;

public class InheritanceDemo {

    public static void main(String[] args){
        MountBike mb1 = new MountBike(1,25);
    }
}
class Bike{
    int speed;
    Bike(){
        System.out.println("dummy Bike constructor");
    }
    Bike(int speed){
        System.out.println(" Bike ARG Constructor");
        this.speed = speed;
    }
    void increaseSpeed(){
        speed = speed+1;
        System.out.println(speed);
    }
    void decreaseSpeed(){
        speed = speed-1;
        System.out.println(speed);
    }

}
class MountBike extends Bike{
    int brake;
    MountBike(){
        System.out.println("dummy MountBike Constructor");
    }
    MountBike(int brake, int speed){
        super(speed);
        System.out.println(" MountBike ARG Constructor");
        this.brake = brake;
    }
    void applyBreaks(){
        brake = brake-1;
        System.out.println(brake);
    }
}
