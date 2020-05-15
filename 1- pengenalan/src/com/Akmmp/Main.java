package com.Akmmp;

import java.io.IOException;

class Mahasiswa {
    String Nama;
    String Jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) throws IOException {

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.Nama = "ucup";
        mahasiswa1.Jurusan = "teknik";
        mahasiswa1.umur = 19;
        mahasiswa1.IPK = 4.0;

        System.out.println(mahasiswa1.Nama);
        System.out.println(mahasiswa1.Jurusan);
        System.out.println(mahasiswa1.umur);
        System.out.println(mahasiswa1.IPK);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.Nama = "jamal";
        mahasiswa2.Jurusan = "teknik";
        mahasiswa2.umur = 19;
        mahasiswa2.IPK = 4.0;

        System.out.println(mahasiswa2.Nama);
        System.out.println(mahasiswa2.Jurusan);
        System.out.println(mahasiswa2.umur);
        System.out.println(mahasiswa2.IPK);


    }
}
