package com.bell.b11.day4;

public class StaticAccessDemo {

    public static void main(){

    }

    public void test(){

        System.out.println(StaticAccess.b);
        StaticAccess.display();
        StaticAccess sa1 = new StaticAccess();
        System.out.println(sa1.a);
        sa1.present();

    }
}


class StaticAccess{

    int a;
    static int b;

    static void display(){
        System.out.println("This is inside a static method");
    }


    void present(){

        System.out.println(a);
        System.out.println("inside non-satic");
    }
}
