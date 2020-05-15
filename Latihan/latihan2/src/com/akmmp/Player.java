package com.akmmp;

class Player {
    private String name;
    private int level;
    private int health;
    private int attacPower;
    private int defencePower;
    private boolean isAlive;
    private Weapon weapon;
    private Armor armor;

    Player(String name){
        this.name = name;
        this.health = 100;
        this.level = 1;
        this.attacPower = 100;
        this.defencePower = 50;
        this.isAlive = true;
    }

    
    public String getName() {
        return this.name;
    }

    public boolean getIsAlive(){
        return this.isAlive;
    }

    public int getHealth() {
        return this.health + this.armor.getHealth();
    }

    public void display(){
        System.out.println("\nnama = " + this.name);
        System.out.println("health = " + this.getHealth());
        System.out.println("level = " + this.level);
        System.out.println("attack power = " + getAttack());
        System.out.println("defence power = " + this.getDefence());
        isAlive();

    }

    /**
     * @param armor the armor to set
     */
    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    /**
     * @param weapon the weapon to set
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    private int levelUp(){
        return this.level++;
    }

    private void isAlive(){
        if(this.isAlive){
            System.out.println("Ststus = hidup");
        } else {
            System.out.println("Status = mati");
        }
    }

    public void attack(Player opponent){
        System.out.println("\n"+this.name + " attack " + opponent.getName());
        int damage = this.getAttack();
        opponent.defence(damage);
        levelUp();
    }

    public void defence(int damage){
        int defencePower = this.getDefence();
        int deltaDamage;

        System.out.println(this.getName() + " defence power " + defencePower);
        if(damage > defencePower){
            deltaDamage = damage - defencePower;
        } else{
            deltaDamage = 0;
        }

        System.out.println(this.getName() + " get damage " + deltaDamage);

        this.health -= deltaDamage;

        levelUp();

        this.display();
    }

    private int getAttack(){
        return this.attacPower + this.weapon.getAttackPower();
    }

    private int getDefence(){
        return this.defencePower + this.armor.getDefencePower();
    }

}