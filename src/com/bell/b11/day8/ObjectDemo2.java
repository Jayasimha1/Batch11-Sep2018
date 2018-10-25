package com.bell.b11.day8;

import java.util.Objects;

public class ObjectDemo2 {

    public static void main(String[] args)
    {
        int a=10;
        int b=10;
        if(a==b){
            System.out.println("a & b are equal");
        }else{
            System.out.println(" a & b are not equal");
        }

        Hello h1 = new Hello(10,20);
        Hello h2 = new Hello(10,20);
        Hello h3 = null;
        ABC a1 = new ABC();

        if(h1==h2){
            System.out.println("Both h1 & h2  are same in ==");
        }else{
            System.out.println("h1 & h2 are not same in ==");
        }

        if(h1.equals(h1)){
            System.out.println("Both h1 & h2  are same in equals method");
        }else{
            System.out.println("h1 & h2 are not same in equals method");
        }







    }
}


class Hello{
      int x, y;

      Hello(int x, int y){
          this.x =x;
          this.y =y;
      }

    @Override
    public String toString() {
        return "Hello{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Hello hello = (Hello) o;
        return x == hello.x &&
                y == hello.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }
}


class ABC{

}
