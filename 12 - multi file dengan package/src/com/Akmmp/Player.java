package com.Akmmp;

class Player{
    private String name;

    public Player(String name){
        this.name = name;
    }

    void setName(String name){
        this.name = name;
    }

    void show(){
        System.out.println("player name: " + this.name);
    }
}
