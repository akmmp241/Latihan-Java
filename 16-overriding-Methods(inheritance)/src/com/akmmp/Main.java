package com.akmmp;

public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero();
        hero1.name = "Luffy";
        // hero1.defencePower = gak punya
        hero1.display();

        HeroStrenght hero2 = new HeroStrenght();
        hero2.name = "Rias";
        hero2.defencePower = 100;
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Akeno";
        hero3.display();
    }
}