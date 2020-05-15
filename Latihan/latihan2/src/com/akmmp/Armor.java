package com.akmmp;

class Armor {
    private int health;
    private int defencePower;

    Armor(int health, int defencePower){
        this.health = health;
        this.defencePower = defencePower;
    }

    public int getHealth(){
        return this.health;
    }

    public int getDefencePower(){
        return this.defencePower;
    }

}