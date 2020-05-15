package com.Akmmp;

class Player{
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int incrementHealth;
    private int incrementAttack;
    private int level;
    private int totalDamage;
    private boolean isAlive;

    // object member
    private Armor armor;
    private Weapon weapon;

    public Player(String name){
        this.name = name;
        this.baseHealth = 500;
        this.baseAttack = 10;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 30;
        this.isAlive = true;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.maxHealth() - this.totalDamage;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }

    public void display(){
        System.out.println("Player\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Health\t\t: " + this.getHealth() +"/" + this.maxHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower());
        checkAlive();
    }

    public void attack(Player opponent){
        // hitung damage
        int damage = this.getAttackPower();
        // print event
        System.out.println(this.name + " attacking " + opponent.getName() + " with  attack power :  " + damage);
        // attack si opponent
        opponent.defence(damage);

        this.levelUp();
    }

    public void defence(int damage){

        // receive damage
        int defencePower = this.armor.getDefencePower();
        int deltaDamage;

        System.out.println(this.name + " defence power : "+ defencePower);
        if(damage > defencePower){
            deltaDamage = damage - defencePower;

        } else {
            deltaDamage = 0;
        }

        System.out.println(this.getName() + " gets damage = " + deltaDamage + "\n");

        // adding total damage
        this.totalDamage += deltaDamage;

        // check is alive
        if (this.getHealth() <= 0){
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }

        this.display();
    }

    public void checkAlive() {
        if (getIsAlive()){
            System.out.println("Status\t\t: Life" + "\n");
        } else {
            System.out.println("Status\t\t: Death" + "\n");
        }
    }

    private int getAttackPower(){
        return this.baseAttack + this.level*this.incrementAttack + this.weapon.getAttack();
    }

    private void levelUp(){
        this.level++;
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public int maxHealth(){
        return this.baseHealth  + this.level*this.incrementHealth +  this.armor.getAddHealth();
    }

    public void winOrLose(Player opponent) {
        if (this.getIsAlive()) {
            System.out.println(opponent.name + " Is Dead" + "\n");
            System.out.println(this.name + " Is The Winner!!");
        } else if (opponent.getIsAlive()) {
            System.out.println(this.name + " Is Dead" + "\n");
            System.out.println(opponent.name +  " Is The Winner!!");
        }
    }
}

class Weapon{
    private String name;
    private int attack;

    public Weapon(String name, int attack){
        this.name = name;
        this.attack = attack;
    }

    public int getAttack(){
        return this.attack;
    }
}

class Armor{
    private String name;
    private int strength;
    private int health;

    public Armor(String name, int strength, int health){
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public int getAddHealth(){
        return this.strength*10 + this.health;
    }

    public int getDefencePower(){
        return this.strength*2;
    }

}

public class Main{
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("UCUP");
        Armor armor1 = new Armor("BAJU BESI",7,200);
        Weapon weapon1 = new Weapon("PEDANG", 30);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        Player player2 = new Player("ISSABELA");
        Armor armor2 = new Armor("GAUN PESTA",3,160);
        Weapon weapon2 = new Weapon("PECUT", 40);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        Tool jeda = new Tool();

        jeda.clearscreen();
        System.out.println("\n\n\n\n\nWELCOME TO THE GAME");
        jeda.clearScreen();
        System.out.println("First Player : ");
        jeda.jeda();
        player1.display();
        jeda.jeda();
        System.out.println("VERSUS");
        jeda.jeda();
        System.out.println("Second Player : ");
        jeda.jeda();
        player2.display();
        jeda.clearScreen();
        System.out.println("FIGHT BEGIN!!!!");
        jeda.jeda();


        int stage = 1;
            while (player1.getIsAlive() && player2.getIsAlive()) {
                jeda.clearScreen();
                System.out.println("Stage " + stage + "\n");
                player1.attack(player2);
                player2.attack(player1);
                stage++;
            }

        jeda.clearScreen();
        player1.winOrLose(player2);
        jeda.clearScreen();
        System.out.println("\nBYE. WAIT FOR NEW UPDATES\n\n");


    }
}