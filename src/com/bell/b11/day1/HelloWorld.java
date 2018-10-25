package com.bell.b11.day1;

public class HelloWorld {

    static final int amount = 100;
    boolean firstProgram = true;

    static byte test=127;



    public static void main(String[] args){
        int a = 20;

        double b =20.52;
        float c =20.65f;
        boolean isNow=true;

        int decimalLiteral = 200;
        int octalLiteral = 0200;
        int hexaLiteral = 0x123AB;
        String location = "Sterling 20166";
        char dollar = '$';

        System.out.println(decimalLiteral);
        System.out.println("decimalLiteral");
        System.out.println(octalLiteral);
        System.out.println(hexaLiteral);

        System.out.println("-------------------------");

        System.out.println(amount);

        System.out.println(amount);
        System.out.println("Welcome to java world");
        System.out.println(test);
        System.out.println(a );
        System.out.println(b );
        System.out.println(c );
        System.out.println(isNow );

        int x = 10;
        int y = 20;
        int z = 30;

        boolean output = ((x>y) || (y<z));
        System.out.println(output);
        String result = (x<y)?"x is big":"y is big";
        System.out.println(result);

    }

}
