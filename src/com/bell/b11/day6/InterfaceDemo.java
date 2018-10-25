package com.bell.b11.day6;

public class InterfaceDemo {


    public static void main(String[] args){

        Vehicle v1 = new Jet();
        Vehicle v2  = new Boeing();
        v2.fuel();
        v2.mode();
        v2.speed();

    }

}

/**
 * By default all the methods are public abstract
 * All varibales are final and static
 * Interfaces doesn't allow constructors
 * Any sub class of Interface should implement all the methods or make that subclass as abstract class
 *
 */
interface Vehicle {


    public static final int MIN_SEATS = 5;

    void speed();
    void mode();
    public abstract void fuel();

}
abstract class Plane implements Vehicle{
    @Override
    public void mode() {
        System.out.println("On Air");
       // min_seats =10;

    }
    @Override
    public void fuel() {
        System.out.println("White Petrol");
    }
}

class Jet extends Plane{

    @Override
    public void speed() {
        System.out.println("328 mph");
    }
}

class Boeing extends Plane{

    @Override
    public void speed() {
        System.out.println("600 mph");
    }
}