package com.akmmp;

public class HeroStrenght extends Hero{
    double defencePower;

    // Overriding methods
    void display(){
        System.out.println("\nHero Strenght");
        System.out.println("Hero Name : " + this.name);
        System.out.println("Defence power : " + this.defencePower);
    }
}