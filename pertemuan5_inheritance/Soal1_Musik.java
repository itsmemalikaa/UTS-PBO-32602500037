/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5_inheritance;

// Parent Class (Induk)
class AlatMusik {
    public void mainkan() {
        System.out.println("Alat musik sedang dimainkan...");
    }
}

// Child Class (Anak)
class Gitar extends AlatMusik {
    public void petik() {
        System.out.println("Gitar dipetik: Jrenggg...");
    }
}

// Class Utama untuk menjalankan Soal 1
public class Soal1_Musik {
    public static void main(String[] args) {
        System.out.println("=== SOAL 1: Single Inheritance ===");
        
        Gitar gitarKu = new Gitar();
        gitarKu.mainkan(); 
        gitarKu.petik();   
    }
}
