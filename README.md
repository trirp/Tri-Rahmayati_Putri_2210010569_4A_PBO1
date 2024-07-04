# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Sepatu`, `SepatuDetail`, dan `SepatuBeraksi` adalah contoh dari class.

```bash
public class Sepatu {
    ...
}

public class SepatuDetail extends Sepatu {
    ...
}

public class SepatuBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `spt[i] = new SepatuDetail(merek, kodebarang);` adalah contoh pembuatan object.

```bash
spt[i] = new SepatuDetail (merek, kodebarang);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merek` dan `kodebarang` adalah contoh atribut.

```bash
String merek;
String kodebarang;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Sepatu` dan `SepatuDetail`.

```bash
public Sepatu(String merek, String kodebarang) {
  this.merek = merek;
  this.kodebarang = kodebarang;
}

public SepatuDetail (String merek, String kodebarang) {
  super(merek, kodebarang);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerek` dan `setKodebarang` adalah contoh method mutator.

```bash
public void setMerek(String merek) {
  this.merek = merek;
}
    
public void setKodebarang(String kodebarang) {
  this.kodebarang = kodebarang;
}
    
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerek`, `getKodebarang` adalah contoh method accessor.

```bash
public String getMerek(){
  return merek;
}
    
public String getKodebarang() {
  return kodebarang;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merek` dan `kodebarang` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merek;
private String kodebarang;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `SepatuDetail` mewarisi `Sepatu` dengan sintaks `extends`.

```bash
public class SepatuDetail extends Sepatu {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Sepatu` merupakan overloading method `displayInfo` dan `displayInfo` di `SepatuDetail` merupakan override dari method `displayInfo` di `Sepatu`.

```bash
public String displayInfo (String kondisi) {
  return displayInfo ()+ "     Kondisi : "+kondisi;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKodebarang` dan seleksi `switch` dalam method `getProdi`.

```bash
if ("01".equals(getKodebarang().substring(0, 2))){
      return "Running";
  } if ("02".equals(getKodebarang().substring(0, 2))){
      return "Sneakers";
  } if ("03".equals(getKodebarang().substring(0, 2))){
      return "Slip On";
  } else {
      return "Jenis Sepatu Tidak Diketahui";
  }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<spt.length; i++) {
    ...
}

for (SepatuDetail data: spt) {
```
}

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner (System.in);
System.out.print("Masukkan Merek Sepatu "+(i+1)+": ");
String merek = scanner.nextLine();
System.out.print("Masukkan Kode Barang "+(i+1)+": ");
String kodebarang = scanner.nextLine();

System.out.println(spt.displayInfo());
System.out.println(spt.displayInfo("baru"));
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `SepatuDetail[]spt = new SepatuDetail[3];` adalah contoh penggunaan array.

```bash
SepatuDetail[]spt = new SepatuDetail[3];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
}catch (NumberFormatException e){
    System.out.println("Kesalahan Format Angka Barang: "+e.getMessage());
}catch (Exception e){
    System.out.println("Kesalahan Umum: "+e.getMessage());
} 
```

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
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Tri Rahmayati Putri
NPM: 2210010569
