package com.vitoradityaf.LatihanModul2.Polymorphism;

public class Main_Overloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Hunting for your dreams");
        Lagu lagu2 = new Lagu("Here", "Junna");


        lagu1.getDataLagu();
        System.out.println();
        lagu2.getDataLagu();
    }
}
