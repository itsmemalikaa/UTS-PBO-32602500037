# Nama: Malika
# Tugas: PBO Pertemuan 3 (Versi Python)

class Mahasiswa:
    def __init__(self, nama, nim):
        self.__nama = nama    # Private (pakai tanda __)
        self.set_nim(nim)     # Panggil setter untuk validasi

    # Getter Nama
    def get_nama(self):
        return self.__nama

    # Getter NIM
    def get_nim(self):
        return self.__nim

    # Setter NIM (Validasi 10 Digit sesuai NIM Malika)
    def set_nim(self, nim):
        # Cek apakah panjang karakter = 10
        if len(nim) == 10:
            self.__nim = nim
        else:
            print(f"Error: NIM {nim} tidak valid! Harus 11 digit.")
            self.__nim = "KOSONG"

# --- BAGIAN MENJALANKAN (MAIN) ---

print("=== TEST 1: Data Benar (NIM Malika 10 digit) ===")
m1 = Mahasiswa("Malika", "3260250037")
print("Nama:", m1.get_nama())
print("NIM :", m1.get_nim())

print("\n=== TEST 2: Data Salah (NIM Pendek) ===")
m2 = Mahasiswa("Budi", "123")
print("Nama:", m2.get_nama())
print("NIM :", m2.get_nim())