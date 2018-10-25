package com.bell.b11.day8.exceptions;

public class Scenario3 {

    public static void main(String[] args)  {
        Scenario3 s1 = new Scenario3();
        int x = 0;
        x = s1.method(10, 0);

        System.out.println(x);

    }

    int method(int a, int b)  throws ArithmeticException,IndexOutOfBoundsException{

        int c = division(a, b);
        return c;
    }

    int division(int a, int b) throws ArithmeticException,IndexOutOfBoundsException {
        int c = a/b;

        return c;
    }


}
