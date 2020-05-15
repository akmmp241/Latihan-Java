package com.Akmmp;

public class Jeda {
    public static void jeda()throws Exception {
        Main main;
        try {
            System.in.read();
        } catch (Exception e){}
    }
    static void clearScreen() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
}
