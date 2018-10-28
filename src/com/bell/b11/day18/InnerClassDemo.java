package com.bell.b11.day18;

public class InnerClassDemo {

    public static void main(String[] args) {

        Car c1 = new Car();

        Car.CarRepair cr = c1.new CarRepair();
        System.out.println(cr.cost());

        System.out.println(c1.speed());


        Bus.BusRepair br = new Bus.BusRepair();
        System.out.println(br.cost());

    }
}

//https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
//Class inside class is called Nested class
//inside class without static is called inner class
class Car {

    int speed(){
        return 200;
    }


    class CarRepair{

        int cost(){
            return 100;
        }


    }

}

//nested class with static, called as static nested class
class Bus{
    int speed(){
        return 150;
    }
    static class BusRepair{
        int cost(){
            return 50;
        }

    }
}
