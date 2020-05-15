package com.Akmmp;

class Weapon {
    private String name;
    private int attackPower;

    public Weapon(String name, int attackPower) {
        this.attackPower = attackPower;
        this.name = name;
    }

    public int getAttackPower() {
        return this.attackPower;
    }
}
