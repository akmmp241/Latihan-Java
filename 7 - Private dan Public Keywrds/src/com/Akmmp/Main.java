package com.Akmmp;

class Player {
    String nama; // default akan bisa dibaca dan ditulis di manapun
    public int exp; // public, akan bisa dibaca dan ditulis dimanapun
    private int health; // private, hanya bisa dibaca dan ditulis didalam class-nya saja

    Player(String nama, int exp, int health) {
        this.exp = exp;
        this.nama = nama;
        this.health = health;
    }

    // default accsess modifier
    void display(){
//        tambahExp(); // contoh memgakses private methods
        System.out.println("Nama : " + this.nama);
        System.out.println("exp : " + this.exp);
        System.out.println("health : " + this.health);
    }

    public void ubahNama(String namaBaru) {
        this.nama = namaBaru;
    }

    private void tambahExp(){
        this.exp += 100;
    }
}

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("marni",100,100);

        //default
        System.out.println(player1.nama);
        player1.nama = "Ucup";
        System.out.println(player1.nama);

        // public
        System.out.println(player1.exp);
        player1.exp = 10000;
        System.out.println(player1.exp);

        // private (tidak dapat diakses)
//        System.out.println(player1.health); // tidak datpat dibaca
//        player1.health = 1000; // tidak dapat ditulis

        // untuk methods

        //default
        player1.display();

        // public
        player1.ubahNama("Jamal");
        player1.display();

        // private ( tidak dapat di akses )
//        player1.tambahExp();
        player1.display();



    }
}
