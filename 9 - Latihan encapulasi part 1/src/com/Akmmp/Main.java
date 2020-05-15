package com.Akmmp;


class Player{
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int level;
    private int incrementHealth;
    private int incrementAttack;
    private int totalDamage;
    private boolean isAlive;

    // object member
    private Armor armor;
    private Weapon weapon;

    public Player(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level  = 1;
        this.incrementAttack = 20;
        this.incrementHealth = 20;
        this.isAlive = true;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.maxHealth() - this.totalDamage;
    }

    public boolean getisAlive() {
        return this.isAlive;
    }

    public void display() {
        System.out.println("Player\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Health\t\t: " + this.getHealth() + "/" + this.maxHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower());
        checkAlive();
    }

    public void attack(Player opponent){
        // count damage
        int damage = this.getAttackPower();
        //print event
        System.out.println(this.name + " is attacking " + opponent.getName() + " with damage : " + damage);
        //attack si opponent
        opponent.defence(damage);

        this.levelUp();
    }

    public void defence(int damage){

        int defence = this.armor.getDefencePower();
        int deltaDamage;

        System.out.println(this.name + " defence power : " + defence);

        if (damage > defence) {
            deltaDamage = damage - defence;
        } else {
            deltaDamage = 0;
        }

        System.out.println(this.name + " gets damage : " + deltaDamage + "\n");

        // adding total damage
        this.totalDamage += deltaDamage;

        //check is alive
        if (this.getHealth() <= 0) {
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }

        this.display();
    }

    public void checkAlive(){
        if (this.getisAlive()) {
            System.out.println("Status\t\t: hidup" + "\n");
        } else {
            System.out.println("status\t\t: mati" + "\n");
        }
    }

    private void levelUp() {
        this.level++;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }

    public int  maxHealth(){
        return this.baseHealth + this.level*this.incrementHealth + this.armor.getAddHealth();
    }

    public int getAttackPower(){
        return this.baseAttack + this.level+this.incrementAttack + this.weapon.getAttackPower();
    }

}

class Weapon{
    private String name;
    private int attack;


    public Weapon(String name, int attack){
        this.name = name;
        this.attack = attack;
    }

    public int getAttackPower(){
        return this.attack;
    }
}

class Armor{
    private String name;
    private int defencePower;
    private int health;

    public Armor(String name,int defencePower, int health) {
        this.name = name;
        this.defencePower = defencePower;
        this.health = health;
    }

    public int  getAddHealth(){
        return this.defencePower*10 + this.health;
    }

    public int getDefencePower(){
        return this.defencePower*2;
    }

}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("MUKIDI");
        Weapon weapon1 = new Weapon("PEDANG", 10);
        Armor armor1 = new Armor("BAJU BESI" , 5, 100);

        player1.setWeapon(weapon1);
        player1.setArmor(armor1);

        Player player2 = new Player("MAHMUD");
        Weapon weapon2 = new Weapon("PECUT", 40);
        Armor armor2 = new Armor("GAUN PESTA" , 1, 40);

        player2.setWeapon(weapon2);
        player2.setArmor(armor2);

        Jeda jeda = new Je''

        player1.display();
        player2.display();

        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);

    }
}
