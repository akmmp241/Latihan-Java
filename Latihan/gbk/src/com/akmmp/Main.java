package com.akmmp;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random R = new Random();

        String[] gbk = {"1.gunting","2.batu","3.kertas"};

        System.out.println("\n\t\tWelcome To The Game\n");
        jeda();

        clearScreen();

        System.out.print("siapa anda: ");
        String nama = scan.nextLine();
        jeda();

        int scorePemain = 0;
        int scoreKomputer = 0;
        boolean start = true;
        
        while (start) {
            clearScreen();

            int kom = R.nextInt(3);

            System.out.println("\n\t\tGuntingBatuKertas\n");
            tampilkanData(gbk);
            System.out.println("0.keluar");

            System.out.print("pilihan anda: ");
            String pemain = scan.nextLine();

            System.out.println(kom);
            start = false;
        }
        

        


    }

    private static void tampilkanData(String[] data){
        for (int i = 0;i < data.length;i++){
            System.out.println(data[i]);
        }
    }

    private static boolean isLanjutkan() {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nApakah anda ingin melajutkan? (y/n) ");
        String pilihanUser = scan.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.out.println("pilihlah 'y' / 'n'");
            System.out.print("\nApakah anda ingin melajutkan? (y/n) ");
            pilihanUser = scan.next();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }

    static void clearScreen(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    static void jeda(){
        try{
            System.in.read();
        } catch (Exception e){}
    }

}