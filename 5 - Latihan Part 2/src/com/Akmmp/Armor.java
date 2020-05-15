package com.Akmmp;

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
    }
}