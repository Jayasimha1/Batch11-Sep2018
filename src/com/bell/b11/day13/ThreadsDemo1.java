package com.bell.b11.day13;

public class ThreadsDemo1 {

    public static void main(String[] args){

        System.out.println("Program Started");

        Thread t = Thread.currentThread();
        t.setName("My First Thread Program");
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.getState());
        System.out.println(t.getId());
        System.out.println(t.isAlive());
        System.out.println(t.getThreadGroup());

        System.out.println("Program Ended");
    }
}
