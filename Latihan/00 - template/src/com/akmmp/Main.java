package com.akmmp;

class Hero {
    protected String name;
    protected String type;
    protected double attackPower = 10;
    protected double defencepower = 10;
    protected int level = 1;
    protected double health = 10;

    protected int LevelUp() {
        return this.level++;
    }

    void display() {
        System.out.println("\nName: " + this.name);
        System.out.println("Level: " + this.level);
        System.out.println("Health: " + this.health);
        System.out.println("HeroType: " + this.type);
    }

    void attack(HeroAttack heroAttack, HeroDefence heroDefence, HeroAttack heroOpponent, HeroDefence hero2Opponent) {
        double damage = heroAttack.getAttackPower() + heroDefence.attackPower;

        System.out.println("\n" + heroAttack.getName() + "," + heroDefence.getName() + " attack " + heroOpponent.getName() + "," + hero2Opponent.getName());

        defence(damage, heroOpponent, hero2Opponent);
    }

    private void defence(double damage, HeroAttack defence1, HeroDefence defence2) {
        double defencePower = defence1.defencepower + defence2.getDefencepower();
        double deltaDamage;

        System.out.println(defence1.getName() + "," + defence2.getName() + " defending");

        if (damage > defencePower ) {
            deltaDamage = damage - defencePower;
        }
        else {
            deltaDamage = 0;
        }

        System.out.println(defence1.getName() + "," + defence2.getName() + " gets damage: " + deltaDamage);

        defence1.health -= deltaDamage;
        defence2.health -= deltaDamage;
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

    public String getName() {
        return this.name;
    }
}

class Armor {
    private String name;
    private double defencePower;

    Armor(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    public double getDefencePower() {
        return this.defencePower;
    }

    public String getName() {
        return this.name;
    }
}

class HeroAttack extends Hero {
    Weapon weapon;
    Armor armor;
    
    HeroAttack(String name) {
        this.name = name;
        this.type = "HeroAttack";
    }

    public String getName() {
        return this.name;
    }

    public double getAttackPower() {
        return this.weapon.getAttackPower() + this.attackPower + (5*this.level);
    }

    public double getDefencePower() {
        return this.armor.getDefencePower()+this.defencepower;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        super.display();
        System.out.println("Weapon: " + this.weapon.getName() + ", Power: " + this.weapon.getAttackPower());
        System.out.println("Armor: " + this.armor.getName() + ", Defence: " + this.armor.getDefencePower());
        System.out.println("attack power: " + this.getAttackPower());
        System.out.println("defence power: " + this.getDefencePower());
    }
    
}

class HeroDefence extends Hero{
    Weapon weapon;
    Armor armor;

    HeroDefence(String name) {
        this.name = name;
        this.type = "HeroDefence";
    }

    public String getName() {
        return this.name;
    }

    public double getDefencepower() {
        return this.armor.getDefencePower()+ this.defencepower + (5*this.level);
    }

    public double getAttackPower() {
        return this.weapon.getAttackPower() + this.attackPower;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        super.display();
        System.out.println("Weapon: " + this.weapon.getName() + ", Power: " + this.weapon.getAttackPower());
        System.out.println("Armor: " + this.armor.getName() + ", Defence: " + this.armor.getDefencePower());
        System.out.println("attack Power: " + this.getAttackPower());
        System.out.println("Defence Power: " + this.getDefencepower());
    }
}

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();

        // Tim 1
        HeroAttack hero1A = new HeroAttack("Levi");
        HeroDefence hero1D = new HeroDefence("Akmal");
        Weapon weapon1 = new Weapon("Pedang Emas",  14);
        Weapon weapon2 = new Weapon("Tombak Kayu", 4);
        Armor armor1 = new Armor("Zirah Emas", 12);
        Armor armor2 = new Armor("Baju Besi", 9);

        hero1A.setWeapon(weapon1);
        hero1D.setWeapon(weapon2);
        hero1A.setArmor(armor1);
        hero1D.setArmor(armor2);
        System.out.println("TIM 1");
        hero1A.display();
        hero1D.display();

        // Tim 2
        HeroAttack hero2A = new HeroAttack("Frida");
        HeroDefence hero2D = new HeroDefence("Eren");       
        Weapon weapon3 = new Weapon("Pedang Besi",  10);
        Weapon weapon4 = new Weapon("kapak berkarat", 2);
        Armor armor3 = new Armor("Zirah Emas", 12);
        Armor armor4 = new Armor("Baju Besi", 9);

        hero2A.setWeapon(weapon4);
        hero2D.setWeapon(weapon3);
        hero2A.setArmor(armor4);
        hero2D.setArmor(armor3);
        System.out.println("TIM 2");
        hero2A.display();
        hero2D.display();
        

        hero1A.LevelUp();
        hero1D.LevelUp();
        hero2A.LevelUp();
        hero2D.LevelUp();

        System.out.println("TIM 1");
        hero1A.display();
        hero1D.display();
        System.out.println("TIM 2");
        hero2A.display();
        hero2D.display();

        hero.attack(hero1A, hero1D, hero2A, hero2D);

        System.out.println("TIM 1");
        hero1A.display();
        hero1D.display();
        System.out.println("TIM 2");
        hero2A.display();
        hero2D.display();

    }
}