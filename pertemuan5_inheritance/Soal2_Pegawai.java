/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5_inheritance;

// Class Kakek
class Pegawai {
    public void kerja() {
        System.out.println("Pegawai datang bekerja.");
    }
}

// Class Ayah
class Manajer extends Pegawai {
    public void kelola() {
        System.out.println("Manajer mengelola tim.");
    }
}

// Class Anak (Cucu)
class Direktur extends Manajer {
    public void pimpin() {
        System.out.println("Direktur memimpin perusahaan.");
    }
}

// Class Utama untuk menjalankan Soal 2
public class Soal2_Pegawai {
    public static void main(String[] args) {
        System.out.println("=== SOAL 2: Multilevel Inheritance ===");
        
        Direktur bos = new Direktur();
        bos.kerja();  
        bos.kelola(); 
        bos.pimpin(); 
    }
}
