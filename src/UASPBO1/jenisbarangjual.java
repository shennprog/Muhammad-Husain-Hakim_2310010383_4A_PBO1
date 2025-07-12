
package UASPBO1;

// inheritance(subclass) yang mewakili dari kelas barangjual
public class jenisbarangjual extends barangjual {

    // Atribut tambahan khusus
    private String spesifikasi;

    // construktor kelas anak
    public jenisbarangjual(String idbarang, String merk, double harga, String spesifikasi) {
        super(idbarang, merk, harga); // memanggil konstruktor dari produk
        this.spesifikasi = spesifikasi;
    }
    //getter untuk atribut spesifikasi
    public String getSeri() {
        return spesifikasi;
    }
    //setter untuk atribut spesifikasi
    public void setSeri(String seri) {
        this.spesifikasi = spesifikasi;
    }

    // polymorphism - override method - menimpa method parent dengan versi yang lebih spesifik
    @Override
    public void tampilkaninfo(){
        System.out.println("ID barang : " + super.getidbarang());
        System.out.println("merk   : " + super.getmerk());
        System.out.println("spesifikasi  : " + this.spesifikasi);
        System.out.printf("harga :  Rp%,.0f\n",super.getharga());
        System.out.println("-------------------\n");
        
    }
}
