package com.Akmmp;

public class Main {
    public static void main(String[] args) throws Exception {
        // object player
        Player player1 = new Player("Player 1","Ucup", 10, 100);
        Player player2 = new Player("player 2", "Jamal", 5,50);

        // object weapon
        Weapon senjata1 = new Weapon(25, "Pedang");
        Weapon senjata2 = new Weapon(20,"ketapel");

        //object armor
        Armor armor1 = new Armor("Baju Besi" , 15);
        Armor armor2 = new Armor("kaos ajaib", 10);

        // player 1
        player1.equipWeapon(senjata1);
        senjata1.attackPower = 1000;
        player1.equipArmor(armor1);
        player1.display();

        // player 2
        player2.equipWeapon(senjata2);
        player2.equipArmor(armor2);
        player2.display();


        Jeda.jeda();
        Jeda.clearScreen();
        System.out.println("\nPERTEMPURAN");
        Jeda.jeda();
        System.out.println("\nEPISODE - 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        Jeda.jeda();
        Jeda.clearScreen();
        System.out.println("\nPERTEMPURAN");
        System.out.println("\nEPISODE - 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}
