/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4_konstruktor;

public class Main {
    public static void main(String[] args) {
        // 1. Tes Konstruktor Default
        System.out.println("=== 1. Konstruktor Default ===");
        Buku bukuKosong = new Buku();
        bukuKosong.info();

        // 2. Tes Konstruktor Parameter
        System.out.println("\n=== 2. Konstruktor Parameter ===");
        Buku novel = new Buku("Harry Potter", "J.K. Rowling");
        novel.info();

        // 3. Tes Copy Constructor (Menduplikasi Harry Potter)
        System.out.println("\n=== 3. Copy Constructor ===");
        Buku copyNovel = new Buku(novel); // Kita copy dari objek 'novel'
        copyNovel.info();
    }
}
