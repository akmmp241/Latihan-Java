package com.akmmp;

class Perhitungan extends Menu {

    int Persegi(int angka) {
        Menu.hasil = angka * angka;

        return Menu.hasil;
    }

    int persegiPanjang(int angka1, int angka2) {
        Menu.hasil = angka1 * angka2;

        return Menu.hasil;
    }

    double Segitiga(double alas, double tinggi){
        double Hasil = (double) Menu.hasil;
        Hasil = (1/2) * alas * tinggi;

        return Hasil;
    }
    
}