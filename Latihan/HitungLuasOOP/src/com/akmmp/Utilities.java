package com.akmmp;

import java.util.Scanner;

class Utilities {

    static void clearScreen() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    static void jeda() {
        try {
            System.in.read();
        } catch (Exception e){}
    }

    static boolean getYesOrNo() {
        Scanner input = new Scanner(System.in);

        System.out.print("\nApakah anda ingin melanjutkan? (y/n) ");
        String pilihan = input.next();

        while (!pilihan.equalsIgnoreCase("y") && !pilihan.equalsIgnoreCase("n")) {
            System.err.println("Pilihlah 'y' / 'n'");

            System.out.print("\nApakah anda ingin melanjutkan? (y/n) ");
            pilihan = input.next();
        }

        return pilihan.equalsIgnoreCase("y");
    }
}