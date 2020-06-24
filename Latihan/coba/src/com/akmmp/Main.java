package com.akmmp;

class Hero {
    protected String name;
    protected String type;
    protected double attackPower = 10;
    protected double defencepower = 10;
    protected int level = 1;
    protected double health = 100;
    private Weapon weapon;
    private Armor armor;

    void display() {
        System.out.println("\nName: " + this.name);
        System.out.println("Level: " + this.level);
        System.out.println("Health: " + this.health);
        System.out.println("HeroType: " + this.type);
        
        System.out.println("Weapon: " + this.weapon.name " Power: " + this.weapon.attackPower)
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

class Weapon {
    private String name;
    private double attackPower;

    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public double getAttackPower() {
        return this.attackPower;
    }
}

class Armor {
    private String name;
    private double defencePower

    Armor(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    public double getDefencePower() {
        return this.defencePower;
    }
}

class HeroAttack extends Hero {
    
    HeroAttack(String name) {
        this.name = name;
        this.type = "HeroAttack";
    }

    public double getAttackPower() {
        return weapon.getAttackPower() + this.attackPower + 10;
    }

    this.setWeapon("Pedang Emas", 13)

    void display() {
        super.display();
        System.out.println("attack power: " + getAttackPower());
        System.out.println("defence power: " + this.defencepower);
    }
    
}

class HeroDefence extends Hero{

    HeroDefence(String name) {
        this.name = name;
        this.type = "HeroDefence";
    }

    public double getDefencepower() {
        return this.defencepower+10;
    }

    this.setWeapon("-", 0);

    void display() {
        super.display();
        System.out.println("attack Power: " + this.attackPower);
        System.out.println("Defence Power: " + this.getDefencepower());
    }
}

public class Main {
    public static void main(String[] args) {
        HeroAttack hero1A = new HeroAttack("akmal");
        HeroDefence hero1D = new HeroDefence("johan");

        hero1A.display();
        hero1D.display();

    }
}