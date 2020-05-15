package com.Akmmp;

// keyword import dari package eksternal
import com.terminal.Console;


class Main{
    public static void main(String[] args) {
        Player player1 = new Player("otong");
        Player player2 = new Player("Ucup");
        player1.show();
        player2.show();

        Console.log("wow");
        Console.log("Degan");
    }
}