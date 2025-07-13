# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `barangjual`, `jenisbarangjual`, dan `ShopShenn` adalah contoh dari class.

```java
public abstract class barangjual {
    ...
}

public class jenisbarangjual extends barangjual {
    ...
}

public class ShopShenn {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarbarang[i] = new jenisbarangjual(...);` adalah contoh pembuatan object.

```java
daftarbarang[0] = new jenisbarangjual("VGA01", "NVIDIA", 36000000, "RTX 4090Ti");
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `idbarang`, `merk`, `harga`, dan `spesifikasi` adalah contoh atribut.

```java
private String idbarang;
private String merk;
private double harga;
private String spesifikasi;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `barangjual` dan `jenisbarangjual`.

```java
public barangjual(String idbarang, String merk, double harga) {
    this.idbarang = idbarang;
    this.merk = merk;
    this.harga = harga;
}

public jenisbarangjual(String idbarang, String merk, double harga, String spesifikasi) {
    super(idbarang, merk, harga);
    this.spesifikasi = spesifikasi;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setharga` dan `setSeri` adalah contoh method mutator.

```java
public void setharga(double harga) {
    if (harga >= 0) {
        this.harga = harga;
    }
}

public void setSeri(String seri) {
    this.spesifikasi = seri;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getidbarang`, `getmerk`, `getharga`, dan `getSeri` adalah contoh method accessor.

```java
public String getidbarang() {
    return idbarang;
}

public String getmerk() {
    return merk;
}

public double getharga() {
    return harga;
}

public String getSeri() {
    return spesifikasi;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, semua atribut (`idbarang`, `merk`, `harga`, dan `spesifikasi`) dienkapsulasi.

```java
private String idbarang;
private String merk;
private double harga;
private String spesifikasi;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `jenisbarangjual` mewarisi `barangjual`.

```java
public class jenisbarangjual extends barangjual {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Pada kode ini, method `tampilkaninfo()` di-*override* di class `jenisbarangjual`.

```java
@Override
public void tampilkaninfo() {
    System.out.println("ID barang : " + super.getidbarang());
    System.out.println("merk : " + super.getmerk());
    System.out.println("spesifikasi : " + this.spesifikasi);
    System.out.printf("harga : Rp%.0f\n", super.getharga());
    System.out.println("-------------------\n");
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if-else` dalam pengecekan uang dan barang.

```java
if (barangDipilih != null) {
    if (uang >= barangDipilih.getharga()) {
        double kembalian = uang - barangDipilih.getharga();
        System.out.printf("Pembelian berhasil. kembalian Anda: Rp%.0f\n", kembalian);
    } else {
        System.out.println("Uang Anda tidak cukup.");
    }
} else {
    System.out.println("Produk tidak ditemukan.");
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan `for-each` untuk menampilkan daftar barang dan pencarian berdasarkan merk.

```java
for (barangjual p : daftarbarang) {
    p.tampilkaninfo();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan `Scanner` untuk input dan `System.out.print/println` untuk output.

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan merk yang ingin dibeli: ");
String merkInput = scanner.next();
System.out.print("Masukkan uang anda: Rp");
double uang = scanner.nextDouble();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `barangjual[] daftarbarang = new barangjual[3];` adalah contoh penggunaan array.

```java
barangjual[] daftarbarang = new barangjual[3];
```

14. **Error Handling** belum diterapkan secara eksplisit. Kode tidak memiliki `try-catch` untuk menangani input yang salah (misalnya jika user memasukkan huruf saat diminta angka).



## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |         |
|     | **TOTAL**      | **85**  |

## Pembuat

Nama: Muhammad Husain Hakim
NPM: 2310010383
