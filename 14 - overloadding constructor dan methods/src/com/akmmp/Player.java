package com.akmmp;

public class Player {
    private String name;
    private static int jmlPlayer;

    // overloadding constructor

    // opsi 1
    Player(String name){
        Player.jmlPlayer++;
        this.name = name;
    }

//    opsi 2
    Player(){
        Player.jmlPlayer++;
        this.name = "Player " + jmlPlayer;
    }

    void show() {
        System.out.println("name: " + this.name);
    }
}
