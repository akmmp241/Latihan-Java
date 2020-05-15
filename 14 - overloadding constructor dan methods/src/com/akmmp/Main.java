package com.akmmp;

public class Main {
    public static void main(String[] args) {
        // overloadding pada contructor
        Player player1 = new Player("Saitama");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Naruto");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        // overloadding methods

        int a = Matematika.tambah(1,19);
        System.out.println(a);
        double b = Matematika.tambah(5, 5.5);
        System.out.println(b);


    }
}