package com.vitoradityaf.LatihanModul2.Polymorphism;

public class Main_Overriding {
    public static void main(String[] args) {
        X superClass = new X();
        Y subClass = new Y();

        superClass.getValue("Hi no kuni");
        subClass.getValue("Kaze no kuni");
    }
}
