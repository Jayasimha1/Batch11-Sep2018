package com.bell.b11.day17;

public class PracticeDemo {
    public static void main(String[] args) {
        PracticeDemo pd = new PracticeDemo();
        pd.greet(new HelloWorld());

        Greeting greetingFunction = () ->{System.out.println("Hello World");};

        greetingFunction.perform();

        InnerClassTest ict = new InnerClassTest() {
            @Override
            public void foo() {
                System.out.println("Welcome");
            }

            @Override
            public int too() {
                return 0;
            }

        };

        ict.foo();
    }

    public void greet(Greeting greeting){
        greeting.perform();
    }




}

interface InnerClassTest{
    void foo();
    int too();
}
interface Greeting {

    void perform();

}

class HelloWorld implements Greeting{

    @Override
    public void perform() {
        System.out.println("Hello World");
    }

}

