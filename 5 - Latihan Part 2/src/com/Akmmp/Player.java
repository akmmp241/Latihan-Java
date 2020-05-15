package com.Akmmp;

//import com.Akmmp.Armor;
//import com.Akmmp.Weapon;

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

    void attack(Player musuh) {
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attacking " + musuh.name + " with power : " + this.weapon.attackPower);
        musuh.defence(attackPower);
    }

    void defence(double attackPower) {
        // akan mengambil damage
        double damage;
        if(this.armor.defencePower < this.weapon.attackPower){
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }
        System.out.println(this.name + " defence power : " + this.armor.defencePower);
        this.healt -= damage;
        System.out.println(this.name + " gets damage : " + damage);

    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("\n" + this.player);
        System.out.println("Name   : " + this.name + "\nlevel  : " + this.level);
        System.out.println("Health  : " + this.healt + " Hp");
        this.weapon.display();
        this.armor.display();
    }
}