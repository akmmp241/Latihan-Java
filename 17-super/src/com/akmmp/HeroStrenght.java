package com.akmmp;


// this.name akan mengakses atribut name kalau ada di kelas ini
// jika tidak aa maka akan mengaksas atribut superclass

// super.nama akan selalu mengakses atribut superclass
public class HeroStrenght extends Hero{
    String name = "Class Strenght";

    void display() {
        System.out.println("ini adalah " + this.name);
        this.dummyMethod();
    }

    void displaySuper() {
        System.out.println("ini adalah " + super.name);
        super.dummyMethod();
    }

    void dummyMethod() {
        System.out.println("ini metho yang ada di subclass");
    }
    
}