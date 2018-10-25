package com.bell.b11.day13;

public class ThreadDemo3 {
    public static void main(String[] args){
        MyThread a1 = new MyThread("Java");
        MyThread a2 = new MyThread("SQL");
        MyThread a3 = new MyThread("SCALA");
    }

}

class MyThread extends Thread{

    MyThread(String name){
          setName(name);
          start();

    }

    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println("I'm inside running "+i +" "+ getName());
            try {
                if(getName().equals("Java")){
                    sleep(2000);
                } else if(getName().equals("SQL")){
                    sleep(1000);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }




}
