package com.Akmmp;

class Display {
    private String name;
    static String type = "display";
    

    Display(String name){
        this.name = name;
    }

    void setType(String typeInput){
        // type = typeInput;
        // this.type = typeInput;
        Display.type = typeInput; // paling direkomendasikan
    }

    void show(){
        System.out.println("DSiplay name = " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Display display1 = new Display("monitor");
        display1.show();

        Display display2 = new Display("Smartphone");
        display2.show();

        // tampilkan static variable
        
        // coba mengganti variable staticnya
        display1.setType("Monitor");

    
        System.out.println("\nMenampilkan static variable");
        System.out.println(display1.type); 
        System.out.println(display2.type);
        System.out.println(Display.type); // benar

        


    }
}