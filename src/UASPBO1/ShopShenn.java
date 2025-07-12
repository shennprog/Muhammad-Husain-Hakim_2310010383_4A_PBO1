package UASPBO1;
//import untuk menggunakan scanner (input dari user)

import java.util.Scanner;

// kelas utama untuk menjalankan program (main class)
public class ShopShenn {
    
    //main-entry point program java
    public static void main(String[] args) {
        
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to ShopShenn");

        // Inisialisasi array produk
        barangjual[] daftarbarang = new barangjual[3];
        daftarbarang[0] = new jenisbarangjual("VGA01", "NVIDIA", 36000000, "RTX 4090Ti");
        daftarbarang[1] = new jenisbarangjual("VGA02", "AMD", 7425000, "Ryzen 9900X");
        daftarbarang[2] = new jenisbarangjual("VGA03", "ASUS", 4300000, "STRIX RX 6700");

        System.out.println("\nbarang YANG TERSEDIA DI TOKO\n");
        //menampilkan semua game yang ada di katalog(array)
        for (barangjual p : daftarbarang) {
            p.tampilkaninfo();
            System.out.println("_______");
        }
        
        //menambahkan code membaca input user tersebut 
        System.out.print("\nMasukkan merk yang ingin dibeli: ");
        String merkInput = scanner.next();

        System.out.print("Masukkan uang anda: Rp");
        double uang = scanner.nextDouble();

       barangjual barangDipilih = null;
       //perulangan pda barang berdasarkan id yang ada
        for (barangjual p : daftarbarang) {
            if (p.getmerk().equalsIgnoreCase(merkInput)) {
                barangDipilih = p;
                break;
            }
        }
        
        // if-else-if untuk memeriksa hasil pencarian dan uang
        if (barangDipilih != null) {
            if (uang >= barangDipilih.getharga()) {
                double kembalian = uang - barangDipilih.getharga();
                System.out.printf("Pembelian berhasil. kembalian Anda: Rp%.0f\n" ,kembalian);
            } else {
                System.out.println("Uang Anda tidak cukup.");
            }
        } else {
            System.out.println("Produk tidak ditemukan.");
        }

        scanner.close();
    }
}
