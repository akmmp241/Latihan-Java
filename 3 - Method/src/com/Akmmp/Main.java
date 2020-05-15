package com.Akmmp;

class Mahasiswa {
    String nama;
    String jurusan;

    Mahasiswa(String nama, String jurusan) {
        this.nama = nama;
        this.jurusan = jurusan;
    }

    // method tanpa para return dan tanpa parameter
    void Show() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Jurusan: " + this.jurusan );
    }

    //method tanpa return dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // method dengan return dan tanpa parameter
    String getNama() {
        return  this.nama;
    }
    String getJurusan() {
        return this.jurusan;
    }

    // method dengan return dan dengan parameter
    String Halo(String nama) {
        this.nama = nama;
        return nama;
    }

}

public class Main {
    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("ucup", "teknik");
        mahasiswa1.Show();
        mahasiswa1.setNama("tutung");
        mahasiswa1.Show();
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getJurusan());
        String data = mahasiswa1.Halo("jamal");
        System.out.println("Halo nama saya " + data);


    }
}
