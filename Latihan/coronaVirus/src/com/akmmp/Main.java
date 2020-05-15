package com.akmmp;

import java.util.Scanner;

import com.tool.Tool;
import com.tool.Tool.*;

public class Main {
    public static void main(String[] args) {

        String coronaVirus;
        Scanner scan = new Scanner(System.in);
        System.out.print("Apakah corona virus ada: ");
        coronaVirus = scan.nextLine();

        System.out.println("Selama ada corona virus, yang saya lakukan: ");
        Tool.Jeda();

        int day = 1;
        while (coronaVirus != "tidak") {
            Tool.Jeda();
            System.out.println("day : " + day);
            stayAtHome();
            day++;
        }
    }

    static void stayAtHome() {
        System.out.println("Makan");
        System.out.println("Tidur");
        System.out.println("Game");
    }
}