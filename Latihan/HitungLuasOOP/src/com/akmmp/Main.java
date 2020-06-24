package com.akmmp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Scanner scan = new Scanner(System.in);
        
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            Utilities.clearScreen();
            System.out.println("\n\t\tHitungLuas\n");
            System.out.println("1.Persegi");
            System.out.println("2.PersegiPanjang");
            System.out.println("3.Segitiga");
            System.out.println("4.Lingkaran");
            System.out.println("0.keluar");

            System.out.print("pilihan anda: ");
            int inputUser = scan.nextInt();

            switch (inputUser) {
                case 1:
                    menu.displayPersegi(scan);
                    break;
                case 2:
                    menu.displayPersegiPanjang(scan);
                    break;
                case 3:
                    System.out.println("aku halo");
                    break;
                case 4:
                    System.out.println("aku halo");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.err.println("\nPilihan tidak ditemukan!!!!");
                    Utilities.jeda();
                    break;
            }

            isLanjutkan = Utilities.getYesOrNo();

        }

    }
}