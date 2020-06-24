package com.akmmp;

import java.util.Scanner;

class Menu {
    static int hasil;
    Perhitungan perhitungan;


    // INI DISPLAY UNTUK PERSEGI
    void displayPersegi(Scanner scan) {
        Utilities.clearScreen();

        // mendeklarasikan variable
        int sisi;

        // display menu
        System.out.println("\n\t\tPersegi\n");
        // mengambil input user
        System.out.print("Masukan nilai sisi: ");
        sisi = scan.nextInt();

        // Melakukan perhitungan
        Menu.hasil = perhitungan.Persegi(sisi);
        
        // menampilkan hasil
        System.out.println("\nLuasnya adalah = " + Menu.hasil);
        Utilities.jeda();
    }

    // INI DISPLAY UNTUK PERSEGI PANJANG
    void displayPersegiPanjang(Scanner scan) {
        Utilities.clearScreen();

        // mendeklarasikan variable
        int panjang;
        int lebar;

        // display MENU
        System.out.println("\n\t\tPersegiPanjang\n");
        // mengambil input user
        System.out.print("Masukan nilai panjang: ");
        panjang = scan.nextInt();
        System.out.print("\nMasukan nilai lebar: ");
        lebar = scan.nextInt();

        // Melakukan perhitungan
        Menu.hasil = perhitungan.persegiPanjang(panjang, lebar);

        // menampilkan hasil
        System.out.println("\nLuasnya adalah = " + Menu.hasil);
    }

    // INI DISPLAY UNTUK SEGITIGA
    void displaySegitiga(Scanner scan) {
        Utilities.clearScreen();

        // mendeklarasikan variable
        double alas;
        double tinggi;

        // display MENU
        System.out.println("\n\t\tSegitiga\n");
        // mengambil input user
        System.out.print("Masukan nilai alas: ");
        alas = scan.nextInt();
        System.out.print("\nMasukan nilai tinggi: ");
        tinggi = scan.nextInt();

        // Melakukan perhitungan
        double Hasil = (double) Menu.hasil;
        Hasil = perhitungan.Segitiga(alas, tinggi);

        // menampilkan hasil
        System.out.println("\nLuasnya adalah = " + Hasil);
    }
}