package com.vitoradityaf.TugasModul2.no1;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*String nama;
        int tahunBerdiri;
        String stadion;
        int juaraUcl;
        String deskripsi;
        String name;
        //int repeat = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            if (repeat == 5) {
                break;
            }

            System.out.print("Input\t: ");
            name = scan.next();

            System.out.println("Name\t= " + name);

            repeat = repeat + 1;
        }

        System.out.println("Masukan Nama Team\t: " );*/

        Club hunter = new Club();
        Club companion = new Club("Companion");
        Club thief = new Club("Thief Guild", "A guild for handle thiefs");
        Club nightinggale = new Club("Nightinggale", 201, "The Ragged Flagon");
        Club darkbrotherhood = new Club("The Dark Brotherhood", 195, "Sanctuary", 2, "Guild for assassin");

        hunter.getTeam();
        System.out.println();

        companion.getTeam();
        System.out.println();

        thief.getTeam();
        System.out.println();

        nightinggale.getTeam();
        System.out.println();

        darkbrotherhood.getTeam();
        System.out.println();

    }
}
