package com.bell.b11.day5;

/*
 1. Abstract class is a class where you may have zero or more abstract methods
 2. If you have abstract method, then you must make your class as abstract
 3. If child class fail to provide implementation of abstract parent class then child  class must become abstarct
 4. If you extend a parent abstract class then you must implement parent abstract methods or do point 3
 5. You can create a reference variable but you cannot create an object for abstract class.
 */
public class AbstractDemo {
   public void main(String[] args){
       Animal a1 = new Dog();

   }

}


abstract class Animal{

    int leg_count = 4;
    abstract void eat();

    void noOfEyes(){
        System.out.println("Number of eyes"+ 2);
    }
}

class Dog extends Animal{

    void eat() {
        System.out.println("Dog eats meat");
        leg_count =2;
    }
}

abstract class Cat extends Animal{

    void afraidOf(){
        System.out.println("All cats afraid of Dogs");
    }
}

class Cat1 extends Cat{
    @Override
    void eat() {
        System.out.println("This cat1 drinks only milk");
    }
}

class Cat2 extends Cat{

    @Override
    void eat() {
        System.out.println("This cat2 eats only meat");
    }
}