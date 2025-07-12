
package UASPBO1;


public abstract class barangjual { 
 //atribut private untuk menerapkan enkapsulasi (data hiding)
    private String idbarang;
    private String merk;
    private double harga;

    //construktor untuk inisialisasi objek barang
    public barangjual(String idbarang, String merk, double harga) {
        this.idbarang = idbarang;
        this.merk = merk; // sebelumnya salah: this.merk = nama;
        this.harga = harga;
    }

    //accessor (getter)- untuk mengakses atribut private dari luar classs
    public String getidbarang() {
        return idbarang;
    }

    public String getmerk() {
        return merk;
    }

    public double getharga() {
        return harga;
    }

    //mutator (setter) - untuk mengubah nilai atribut private dari luar class
    public void setharga(double harga) {
        if (harga >= 0) { //validasi sederhana
            this.harga = harga;
        }
    }
    //untuk menampilkan informasi barang
    public abstract void tampilkaninfo();
    
}
