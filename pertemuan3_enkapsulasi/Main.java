/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3_enkapsulasi;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Malika", "3260250037"); 
        System.out.println("Nama: " + m1.getNama());
        System.out.println("NIM : " + m1.getNim());

        System.out.println("--------------------");

        Mahasiswa m2 = new Mahasiswa("Tes Error", "123"); 
    }
}