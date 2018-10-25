package com.bell.b11.day5;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 *  1. Child method can't be accessed by Parent reference variable holding child object
 *  2. In method overriding scenario, child only methods can't be accessed
 *  3. All Parent methods can be accessed.
 */
public class OverridingDemo1 {
    public static void main(String[] args){

        ABC b5 = new XYZ();
        b5.display();
        b5.mtd1();
    }
}

class ABC {

    void mtd1(){
        System.out.println("inside mtd1 of ABC");
    }

    void display(){
        System.out.println("I'm inside ABC parent class");
    }
}


class XYZ extends ABC{

    void mtd2(){
        System.out.println("inside mtd2 of XYZ");
    }
    void display(){
        System.out.println("I'm inside XYZ child class");
    }
}