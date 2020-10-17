package com.vitoradityaf.LatihanModul2.Polymorphism;

public class Y extends X {
    @Override
    public void getValue(String value) {
        super.getValue(value);
        System.out.println("Value Class Y\t: " + value);
    }

}