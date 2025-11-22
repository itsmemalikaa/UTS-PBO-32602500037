/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3_enkapsulasi;

public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        setNim(nim);
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getNim() { return nim; }

   
    public void setNim(String nim) {
        if (nim != null && nim.length() == 10) {
            this.nim = nim;
        } else {
            System.out.println("Error: NIM harus 10 digit!");
        }
    }
}