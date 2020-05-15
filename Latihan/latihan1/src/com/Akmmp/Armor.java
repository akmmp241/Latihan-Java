package com.Akmmp;

class Armor {
    private int defencePwer;
    private String name;
    private int health;

    public Armor(String name, int defencePwer, int health) {
        this.name = name;
        this.defencePwer = defencePwer;
        this.health = health;
    }

    public int getHealth() {
        return this.health + this.defencePwer;
    }

    public int getDefencePwer() {
        return this.defencePwer;
    }
}