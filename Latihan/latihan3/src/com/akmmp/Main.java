package com.akmmp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        clearScreen();

        boolean start = true;

        while (start) {
            clearScreen();
            // MENU
            System.out.println("\t\t\thitungLuas\n");
            System.out.println("1.persegi");
            System.out.println("2.segitiga");
            System.out.println("3.lingkaran");
            System.out.println("0.keluar");

            Scanner scan = new Scanner(System.in);

            System.out.print("Masukan pilihan anda: ");
            int menu = scan.nextInt();

            switch (menu) {
                case 1:
                    persegi();
                    break;
                case 2:
                    segitiga();
                    break;
                case 3:
                    lingkaran();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("menu tidak ditemukan");
                    menu = scan.nextInt();
            }

            start = getYesOrNo();
        }
    }

    private static void clearScreen(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    private static boolean  getYesOrNo(){
        Scanner input = new Scanner(System.in);
        System.out.print("apakah anda ingin melanjutkan? (y/n) ");
        String getYesOrNo = input.nextLine();

        while (!getYesOrNo.equalsIgnoreCase("y") && !getYesOrNo.equalsIgnoreCase("n")){
            System.out.println("masukan 'y' / 'n'");
            System.out.print("apakah anda ingin melanjutkan? (y/n) ");
            getYesOrNo = input.nextLine();
        }

        return getYesOrNo.equalsIgnoreCase("y");
    }

    private static void persegi(){
        clearScreen();

        System.out.println("\t\t\tpersegi\n");

        Scanner input = new Scanner(System.in);

        System.out.print("masukan nilai sisi: ");
        int sisi = input.nextInt();

        int luas = sisi * sisi;

        System.out.println("Luasnya adalah " + luas);
    }

    private static void segitiga(){
        clearScreen();

        System.out.println("\t\t\tpersegi\n");

        Scanner input = new Scanner(System.in);

        System.out.print("masukan nilai alas: ");
        int alas = input.nextInt();
        System.out.print("\nmasukan nilai tinggi: ");
        int tinggi = input.nextInt();

        double luasAsli = 0.5 * alas * tinggi;
        int luas;

        if(luasAsli % 2 == 0){
            luas = (int) luasAsli;
            System.out.println("Luasnya adalah " + luas);
        }else{
            System.out.println("Luasnya adalah " + luasAsli);
        }

        
    }

    private static void lingkaran(){
        clearScreen();

        System.out.println("\t\t\tpersegi\n");

        Scanner input = new Scanner(System.in);

        System.out.print("masukan nilai jari: ");
        int jari = input.nextInt();

        double luas;

        if(jari % 7 == 0){
            luas = (int) 22/7 * jari*jari;
        }else{
            luas =  3.14 *jari*jari;
        }

        System.out.println("Luasnya adalah " + luas);
    }
}