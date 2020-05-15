package com.Akmmp;

class Player {
    private String name;
    private int level;
    private int baseHealth;
    private int baseAttack;
    private int incrementHealth;
    private int incrementAttack;
    private int totalDamage;
    private boolean isAlive;

    // object member
    Weapon weapon;
    Armor armor;

    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.baseHealth = 500;
        this.baseAttack = 50;
        this.incrementHealth = 10;
        this.incrementAttack = 10;
        this.isAlive = true;
    }

    public String getName() {
        return this.name;
    }
    public boolean getIsAlive() {
        return this.isAlive;
    }

    public int getHealth() {
        return this.maxHealth() - this.totalDamage;
    }

    public void display() {
        System.out.println("Player\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Health\t\t: " + this.getHealth() + "/" + this.maxHealth());
        System.out.println("Attack\t\t: " + this.getAttack());
        this.checkAlive();
    }

    private void levelUp() {
        this.level++;
    }

    public void attack(Player opponent){
        // hitung damage
        int damage = this.getAttack();
        // print event
        System.out.println(this.name + " attacking " + opponent.getName() + " with  attack power :  " + damage);
        // attack si opponent
        opponent.defence(damage);

        this.levelUp();
    }

    public void defence(int damage){

        // receive damage
        int defencePower = this.armor.getDefencePwer();
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

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void checkAlive() {
        if (getIsAlive()){
            System.out.println("Status\t\t: Life" + "\n");
        } else {
            System.out.println("Status\t\t: Death" + "\n");
        }
    }

    public int maxHealth() {
        return this.baseHealth + this.level*this.incrementHealth + this.armor.getHealth();
    }

    public int getAttack() {
        return this.baseAttack + this.level*this.incrementHealth + this.weapon.getAttackPower();
    }

    public void winOrLose(Player opponent) {
        if (this.getIsAlive()){
            System.out.println(this.name + " winner");
        } else if (opponent.getIsAlive()) {
            System.out.println(opponent.name + " is the winner");
        } else {
            System.out.println("DRAW");
        }
    }
}