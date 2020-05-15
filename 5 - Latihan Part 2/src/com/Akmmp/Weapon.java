package com.Akmmp;

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
