package com.Akmmp;

public class Tool {
    public void jeda()throws Exception {
        try {
            System.in.read();
        } catch (Exception e){}
    }
    public void clearScreen() {

            try {
                System.in.read();
            } catch (Exception e){}

        System.out.println("\033[H\033[2J");

            try {
                System.in.read();
            } catch (Exception e){}
        }

        public void clearscreen() {
            System.out.println("\033[H\033[2J");
            System.out.flush();
        }
}
