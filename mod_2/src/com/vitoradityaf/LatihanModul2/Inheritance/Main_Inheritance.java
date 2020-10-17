package com.vitoradityaf.LatihanModul2.Inheritance;

public class Main_Inheritance {
    public static void main(String[] args) {
        A supeclass = new A();
        B subclass = new B();

        System.out.println("Input data SuperClass\t: ");
        supeclass.x = 3;
        supeclass.y = 4;
        supeclass.printXY();
        System.out.println();

        System.out.println("Input data SubClass\t: ");
        subclass.x = 30;
        subclass.y = 40;
        subclass.z = 10;
        subclass.printXY();
        System.out.println();

        subclass.sumValue();


    }
}