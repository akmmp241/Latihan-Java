package com.akmmp;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Akmal");
        Player player2 = new Player("Jamal");

        Weapon weapon1 = new Weapon(15);
        Weapon weapon2 = new Weapon(15);

        Armor armor1 = new Armor(10, 15);
        Armor armor2 = new Armor(10, 10);

        player1.setArmor(armor1);
        player2.setArmor(armor2);
        player1.setWeapon(weapon1);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();

        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);
    }
}