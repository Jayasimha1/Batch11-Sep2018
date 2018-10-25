package com.bell.b11.day13;

public class ThreadDemo2 {
    public static void main(String[] args){
        ABC a1 = new ABC("Java");
        ABC a2 = new ABC("SQL");
        ABC a3 = new ABC("SCALA");

    }
}

class ABC implements Runnable{
    Thread t = null;
    ABC(String name){
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("I'm inside running "+i +" "+ t.getName());
            try {
                if(t.getName().equals("Java")){
                  t.sleep(2000);
                } else if(t.getName().equals("SQL")){
                  t.sleep(1000);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}