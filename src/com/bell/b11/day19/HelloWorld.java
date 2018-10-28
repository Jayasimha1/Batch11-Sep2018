package com.bell.b11.day19;

import sun.jvm.hotspot.debugger.Address;

import javax.sound.midi.Soundbank;

public class HelloWorld {

    public static void main(String[] args) {
        HelloWorld hw  = new HelloWorld();

        int a =20;

        Introduction i = new Introduction() {
            @Override
            public void sayHello() {
                System.out.println("Hello Welcome java object world");
            }
        };
        i.sayHello();


        Introduction var =  () -> System.out.println("Hello Welcome java functional world");

        Introduction var1 = () -> {
            System.out.println("Hey Hey");
            System.out.println("Hum thum");
        };
        var.sayHello();
        var1.sayHello();

        Addition addObj = new AddImp();
        System.out.println(addObj.add(10,20));


        Addition var12 =   (int y, int z) ->y+z;
        System.out.println( var12.add(20,30));


        Operation operation = new OperImpl();
        System.out.println(operation.oper("multiply",10,20));

        Operation funVar =  (String type, int p, int q) ->{
            if (type.equals("add")) {
                return p+q;
            }else if(type.equals("multiply")){
                return p*q;
            }else if(type.equals("division")){
                if(q==0){
                    return 0;
                }
                return p/q;
            }
            return 0;
        };

        display(funVar);

    }

    static void display(Operation o){

        System.out.println(o.oper("multiply",25,35));
        System.out.println(o.oper("division",10,0));

    }

}


interface Introduction{
    void sayHello();
}

interface Dummy{
    void sayHello(String name);
}

interface Addition{
    int add(int a, int b);
}

class AddImp implements Addition{

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}

interface Operation{
    int oper(String type,int a, int b);

}

class OperImpl implements Operation{

    @Override
    public int oper(String type, int a, int b) {
        if (type.equals("add")) {
            return a+b;
        }else if(type.equals("multiply")){
            return a*b;
        }else if(type.equals("division")){
            return a/b;
        }
        return 0;
    }
}