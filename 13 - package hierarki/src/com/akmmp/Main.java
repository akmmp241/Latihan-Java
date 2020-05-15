package com.akmmp;


import com.terminal.Console;

// mengimport static method
import static com.terminal.Console.log;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("jamal");
        player1.show();

        Console.log(player1.getName());
        log(player1.getName());
    }
}

//private class Test { /////// bodoh
//
//}




