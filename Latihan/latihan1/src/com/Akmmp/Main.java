package com.Akmmp;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("UCUP");
        Weapon weapon1 = new Weapon("Pedang", 50);
        Armor armor1 = new Armor("baju besi", 10, 100);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);
        player1.display();

        Player player2 = new Player("JAMAL");
        Weapon weapon2 = new Weapon("Tombak", 10);
        Armor armor2 = new Armor("baju Tembaga", 4, 30);
        player2.setWeapon(weapon2);
        player2.setArmor(armor2);
        player2.display();

        while (player1.getIsAlive() && player2.getIsAlive()){
            player1.attack(player2);
            player2.attack(player1);
        }

        player1.winOrLose(player2);
    }
}
