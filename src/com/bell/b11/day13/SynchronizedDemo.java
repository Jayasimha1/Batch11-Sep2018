package com.bell.b11.day13;

public class SynchronizedDemo {
    public static void main(String[] args) {
        new SimpleThread("Siva", 100);
        new SimpleThread("Simha",200);
    }


}
class Account {
    private static int bal = 2000;
    public int getBalance(){
        return bal;
    }
    //Method level synchronization
    public synchronized  void withDraw(int amt){
        bal = bal-amt;
    }
}
class SimpleThread extends Thread{
    String name =null;
    int amt =0;
    SimpleThread(String name, int amt){
        this.name = name;
        this.amt = amt;
        setName(name);
        start();
    }
    public void run(){
        for(int i=0;i<=6;i++){
            checkWithDraw(amt);
        }
    }
    public void checkWithDraw(int amt){
        Account account = new Account();
        if(amt >account.getBalance()){
            System.out.println("Hello "+ name+ " Doesn't have enough balance");
        }else{
            synchronized (account) {
                account.withDraw(amt);
            }
            System.out.println("Hello "+name + " Thank you for the service...Remaing Amount"+account.getBalance());
        }
    }

}