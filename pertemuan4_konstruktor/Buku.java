/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4_konstruktor;

public class Buku {
    String judul;
    String penulis;

    // 1. Konstruktor Default (Tanpa Parameter)
    public Buku() {
        this.judul = "Judul Belum Diisi";
        this.penulis = "Penulis Belum Diisi";
    }

    // 2. Konstruktor Parameterized (Dengan Isi)
    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    // 3. Copy Constructor
    public Buku(Buku bukuLain) {
        this.judul = bukuLain.judul;
        this.penulis = bukuLain.penulis;
    }

    public void info() {
        System.out.println("Buku: " + judul + " | Oleh: " + penulis);
    }
}