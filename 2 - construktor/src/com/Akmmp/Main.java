package com.Akmmp;

import java.io.IOException;

// class tanpa constructor
//class Polos {
//    String Nama;
//    String Jurusan;
//    int Umur;
//}

// class dengan constructor
class Mahasiswa {
    String Nama;
    String Jurusan;
    int Umur;

    // constructor
    Mahasiswa(String nama, String jurusan, int umur) {
        Nama = nama;
        Jurusan = jurusan;
        Umur = umur;

        System.out.println(nama);
        System.out.println(Jurusan);
        System.out.println(Umur);

    }
}


public class Main {
    public static void main(String[] args) throws IOException {


        Mahasiswa mahasiswa1 = new Mahasiswa("ucup","teknik", 20);
        Mahasiswa mahasiswa2 = new Mahasiswa("jamal","teknik", 21);


//        Polos objectPolos = new Polos();
//        objectPolos.Nama = "ucup";
//        objectPolos.Jurusan = "teknik";
//        objectPolos.Umur = 20;
//
//        System.out.println(objectPolos.Nama);
//        System.out.println(objectPolos.Jurusan);
//        System.out.println(objectPolos.Umur);


    }
}
