package com.vitorf.LatMod1.objek;

public class Objek_Main {
    public static void main(String[] args) {
        // deklarasi object tanpa parameter
        Mahasiswa mahasiswak = new Mahasiswa();

        mahasiswak.setNama("jack");
        mahasiswak.setNim(19104001);

        System.out.println("Mahasiswa 1 :");
        System.out.println("Nama\t= " + mahasiswak.getNama());
        System.out.println("Nim\t= " + mahasiswak.getNim());
        System.out.println();

        //deklarasi object dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Vito", 19104063);

        System.out.println("Mahasiswa 2 :");
        System.out.println("Nama\t= " + mahasiswa.getNama());
        System.out.println("Nim\t= " + mahasiswa.getNim());
        System.out.println();
    }
}
