package com.Akmmp;

public class Jeda {
    public void jeda() {
        try{
            System.in.read();
        } catch (Exception e){}

        System.out.println("\033[H\033[2J");
    }
}
