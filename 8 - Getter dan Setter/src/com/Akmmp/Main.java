package com.Akmmp;



class Data {
    public int intPublic;
    private int intPrivate;
    private double aDouble;

    Data(){
        this.intPublic = 0;
        this.intPrivate = 15;
    }

    void display() {
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.aDouble);
    }

    //getter
    public int getIntPrivate() {
        return this.intPrivate;
    }

    //setter
    public void setIntPrivate(double value) {
        this.aDouble = value;
    }
}

class Lingkaran{
    private double diameter;

    Lingkaran(double diameter){
        this.diameter   = diameter;
    }

    //setter
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }

    //getter
    public double getJari2(){
        return this.diameter/2;
    }

    // getter
    public double getLuas() {
        return 3.14*(diameter*diameter)/4;
    }
}

public class Main {
    public static void main(String[] args) {

        Data object = new Data();
        //public
        object.intPublic = 10; // write
        System.out.println("public : " + object.intPublic); // read

        // read only ( memaksai GETTER )
        int angka = object.getIntPrivate();
        System.out.println("getter : " + angka);

        //write only(kita hanya bsa menulis saja)
        object.setIntPrivate(18);
        object.display();

        // gabungkan read dan write dengan setter dan getter
        Lingkaran oject2 = new Lingkaran(7);
        System.out.println("jari-jri : " + oject2.getJari2());
        oject2.setJari2(14);
        System.out.println("jari-jari : " + oject2.getJari2());
        System.out.println("Luas : " + oject2.getLuas());

    }
}
