/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5_inheritance;

class AkunBank {
    private int nomorRahasia = 999; 
    protected int saldo = 10000000;   
    public String pemilik = "Malika"; 
    
    // Getter untuk mengambil data Private
    public int getNomorRahasia() {
        return nomorRahasia;
    }
}

class RekeningTabungan extends AkunBank {
    public void cekInfo() {
        System.out.println("Pemilik (Public): " + pemilik);
        System.out.println("Saldo (Protected): " + saldo);
        
        
        System.out.println("Nomor Rahasia (via Getter): " + getNomorRahasia());
    }
}

// Class Utama untuk menjalankan Soal 3
public class Soal3_Bank {
    public static void main(String[] args) {
        System.out.println("=== SOAL 3: Access Modifier ===");
        
        RekeningTabungan tabungan = new RekeningTabungan();
        tabungan.cekInfo();
    }
}
