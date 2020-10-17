package com.vitorf.LatMod1.Construct0r;

public class DemoManusia {
    public static void main(String[] args) {
        Manusia arrManusia[] = new Manusia[3];

        Manusia man1 = new Manusia();
        man1.setNama("Jean");
        man1.setUmur(20);

        Manusia man2 = new Manusia("Fischi");
        Manusia man3 = new Manusia("Barbara", 18);

        arrManusia[0] = man1;
        arrManusia[1] = man2;
        arrManusia[2] = man3;

        for(Manusia x : arrManusia) {
            System.out.println("Characters =");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
        }
    }
}
