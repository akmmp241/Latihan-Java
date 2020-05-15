package com.Akmmp;

// class player
class Player {
    String player;
    String name;
    double healt;
    int level;

    // object member
    Weapon weapon;
    Armor armor;

    Player(String player, String name, int level, double healt) {
        this.player = player;
        this.name = name;
        this.level = level;
        this.healt = healt;
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println(this.player);
        System.out.println("Name   : " + this.name + "\nlevel  : " + this.level);
        System.out.println("Health  : " + this.healt + " Hp");
        this.weapon.display();
        this.armor.display();
    }
}

// class weapon
class Weapon{
    double attackPower;
    String name;

    Weapon(double attackPower, String name) {
        this.attackPower = attackPower;
        this.name = name;
    }

    void display() {
        System.out.println("Weapon : " + this.name + " | attack power : " + this.attackPower);
    }
}

//class armor
class Armor {
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display() {
        System.out.println("Armor  : " + this.name + " | defence power : " + this.defencePower);
        System.out.println("\n");
    }
}


public class Main {
    public static void main(String[] args) {
        // object player
        Player player1 = new Player("Player 1","Ucup", 100, 100);
        Player player2 = new Player("player 2", "Tong", 1,10);

        // object weapon
        Weapon senjata1 = new Weapon(100, "Pedang");
        Weapon senjata2 = new Weapon(1,"ketapel");

        //object armor
        Armor armor1 = new Armor("Baju Besi" , 100);
        Armor armor2 = new Armor("kaos", 0);

        // player 1
        player1.equipWeapon(senjata1);
        player1.equipArmor(armor1);
        player1.display();

        // player 2
        player2.equipWeapon(senjata2);
        player2.equipArmor(armor2);
        player2.display();
    }
}
