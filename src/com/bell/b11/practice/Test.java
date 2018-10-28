package com.bell.b11.practice;

public class Test {
    public static void main(String[] args) {
       Car c = new Car() {
           @Override
           public int speed() {
               return 200;
           }
       };

        Car speedFuction = ()-> 200;

        System.out.println( speedFuction.speed());
    }
}

interface Car {
    int speed();
}

class Tesla implements Car{

    @Override
    public int speed() {
        return 200;
    }
}
