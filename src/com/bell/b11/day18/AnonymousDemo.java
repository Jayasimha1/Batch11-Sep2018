package com.bell.b11.day18;

public class AnonymousDemo {
    public static void main(String[] args) {

       Animal dog = new Animal() {
           @Override
           public void eat() {
               System.out.println("Dog eat meat");
           }

           @Override
           public void sleep() {
               System.out.println("Dog sleep at morning ");
           }
       };

       Animal cat  = new Animal() {
           @Override
           public void eat() {
               System.out.println("Cat drink milk");
           }

           @Override
           public void sleep() {
               System.out.println("Cat sleeps in night");
           }
       };


       cat.eat();
       dog.eat();




    }
}

interface Animal{
    void eat();
    void sleep();

}

/*class Dog implements Animal{

    @Override
    public void eat() {

    }
}*/
