# Laporan Praktikum #9 - Abstract Class dan Interface
  

**JOBSHEET 9 - Abstract Class dan Interface**

**I. Kompetensi** 

Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu: 
1. Menjelaskan maksud dan tujuan penggunaan Abstract Class; 

2. Menjelaskan maksud dan tujuan penggunaan Interface; 

3. Menerapkan Abstract Class dan Interface di dalam pembuatan program. 
 
**II. Pendahuluan** 

**Abstract Class** 

Abstract Class adalah class yang tidak dapat diinstansiasi namun dapat di-extend. Abstract class baru dapat dimanfaatkan ketika ia di-extend. 
 
**Karakteristik:** 

a. Dapat memiliki properties dan methods seperti class biasa. 

b. Selalu memiliki methods yang tidak memiliki tubuh (hanya deklarasinya saja), disebut juga abstract method. 

c. Selalu dideklarasikan dengan menggunakan kata kunci abstract class. 
 
**Kegunaan:** 

Menggambarkan sesuatu yang bersifat umum, yang hanya bisa berfungsi setelah ia dideskripsikan ke dalam bentuk yang lebih spesifik. 

![Gambar Soal](img/1.PNG)

**Interface**  

Interface adalah struktur data yang hanya berisi abstract methods. Tidak ada apa-apa selain method abstract pada interface, termasuk atribut getter dan setter.  
 
**Karakteristik:**  

a. Tidak ada apa-apa di dalamnya selain abstract methods. 

b. Di konvensi bahasa pemrograman Java, namanya dianjurkan untuk selalu diawali dengan huruf kapital ‘I’. 

c. Selalu dideklarasikan dengan menggunakan kata kunci interface. 

d. Diimplementasikan dengan menggunakan kata kunci implements. 
 
**Kegunaan:**  

Bertindak seperti semacam kontrak/syarat yang HARUS dipenuhi bagi suatu class agar class tersebut dapat dianggap sebagai ‘sesuatu yang lain’. 

![Gambar Soal](img/2.PNG)

**III. Praktikum** 

**Percobaan 1: Abstract Class** 

Di dunia ini terdapat banyak jenis hewan. Semua hewan memiliki beberapa karakteristik yang sama, seperti contohnya semua hewan memiliki umur, hewan apapun itu, umurnya akan bertambah sama jumlahnya setiap tahun. 

Selain karakteristik yang sama, masing-masing hewan juga memiliki karakteristik yang berbeda satu dengan yang lainnya. Contohnya dalam hal **bergerak.** Cara kucing bergerak berbeda dengan cara ikan bergerak. Kucing bergerak dengan cara melangkahkan kaki-kakinya sedangkan ikan bergerak dengan cara menggerakkan siripnya. 

![Gambar Soal](img/3.PNG)

Setiap orang yang memelihara hewan dapat mengajak hewan peliharaannya berjalan (membuat agar hewan peliharaannya bergerak). Namun orang yang memelihara hewan yang berbeda, akan berbeda pula cara hewan peliharaannya dalam bergerak. 

Pada percobaan pertama ini kita akan membuat sebuah program yang menggambarkan skenario di atas dengan memanfaatkan **abstract class.** 

1. Buatlah sebuah project baru di NetBeans dengan nama **PBOMinggu9**

![Gambar Soal](img/4.PNG)

2. Pada package **pbominggu9**, tambahkan package baru dengan cara klik kanan nama package -> New -> Java Package… 

![Gambar Soal](img/5.PNG)

3. Beri nama package tersebut dengan nama **abstractclass**. Semua class yang dibuat pada percobaan 1 ini **diletakkan pada package yang sama**, yaitu package abstractclass ini, 

![Gambar Soal](img/6.PNG)

4. Pada package baru tersebut tambahkan class baru. 

![Gambar Soal](img/7.PNG)

5. Beri nama class baru tersebut, yaitu class Hewan. 

![Gambar Soal](img/8.PNG)

6. Pada class Hewan tersebut, ketikkan kode berikut ini. 

![Gambar Soal](img/9.PNG)

Class Hewan tersebut adalah class abstract berisi property dan method biasa, ditambah sebuah method abstract bernama **bergerak().** Method tersebut didepannya terdapat kata kunci **abstract** dan tidak memiliki badan fungsi. Method ini nantinya akan di-override oleh class mana saja yang menjadi class turunan dari class Hewan tersebut. 
 
7. Dengan cara yang sama, buatlah class dengan nama **Kucing** yang meng-extend class Hewan. Di dalam class Kucing tersebut, setelah Anda menuliskan kode seperti di bawah, maka akan muncul 

 
ikon lampu peringatan. Klik lampu tersebut dan kemudian pilih **implement all abstract methods.** 

![Gambar Soal](img/10.PNG)

8. Maka akan secara otomatis dibuatkan fungsi yang meng-override fungsi abstract **bergerak()** yang ada pada class hewan. 

![Gambar Soal](img/11.PNG)

9. Ubahlah badan fungsi tersebut dengan mengganti kode didalamnya menjadi seperti berikut. 

![Gambar Soal](img/12.PNG)

10. Dengan cara yang sama seperti ketika Anda membuat class Kucing, buatlah class Hewan baru bernama **Ikan** dan buatlah kodenya seperti pada gambar dibawah. 

![Gambar Soal](img/13.PNG)

11. Selanjutnya, buatlah class biasa baru yang bernama class **Orang.** Class ini adalah class yang menjadi pengguna dari class abstract Hewan yang sudah dibuat sebelumnya. Ketikkan pada class Orang tersebut, baris-baris kode seperti di bawah. 

![Gambar Soal](img/14.PNG)

12. Terakhir, buatlah sebuah Main Class baru di dalam package yang sama. Beri nama class baru tersebut dengan nama class **Program.** Ketikkan didalamnya seperti kode di bawah ini. 

![Gambar Soal](img/15.PNG)

13. Jalankan class tersebut dengan cara klik kanan pada class Program kemudian pilih Run File (Shift + F6). 

![Gambar Soal](img/16.PNG)

14. Perhatikan dan amati hasilnya! 

![Gambar Soal](img/17.PNG)

**Hasil Percobaan 1**


  ![Gambar ICumlaude1841720146Bagus](img/a1.PNG)

  [ini link ke kode program Hewan1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan1/Hewan1841720146Bagus.java)

  ![Gambar Ikan1841720146Bagus](img/a2.PNG)

  [ini link ke kode program Ikan1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan1/Ikan1841720146Bagus.java)


  ![Gambar Kucing1841720146Bagus](img/a3.PNG)

  [ini link ke kode program Kucing1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan1/Kucing1841720146Bagus.java)


  ![Gambar Orang1841720146Bagus](img/a4.PNG)

  [ini link ke kode program Orang1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan1/Orang1841720146Bagus.java)


  ![Gambar ProgramMain1841720146Bagus](img/a5.PNG)

  [ini link ke kode program ProgramMain1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan1/ProgramMain1841720146Bagus.java)


  ![Gambar ProgramMain1841720146Bagus](img/a6.PNG)





15. Pertanyaan diskusi: Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak mengimplementasikan method abstract yang ada di class induknya? Buktikan! 

**Hasil Pertanyaan diskusi Percobaan 1**

Tidak bisa 
![Gambar](img/d1.PNG)

![Gambar](img/d2.PNG)

 Bila kita tidak mengimplementasikan maka program tidak bisa di tampilkan,mengimplementasikan kita berarti memanggil data atau isi yang ada pada kelas yang sudah kita extends 

 
  

 
**Percobaan 2: Interface** 

Pada sebuah wisuda, seorang Rektor akan memberikan penghargaan sertifikat Cumlaude pada semua mahasiswa yang memenuhi persyaratan. Persyaratan agar seorang mahasiswa dapat disebut sebagai Cumlaude berbeda-beda antara mahasiswa Sarjana dan Pasca Sarjana. 

![Gambar Soal](img/18.PNG)

Untuk menjadi cumlaude, mahasiswa Sarjana harus mengerjakan skripsi dan memiliki IPK lebih tinggi dari 3,51. Sedangkan untuk mahasiswa Pasca Sarjana, mereka harus mengerjakan tesis dan meraih IPK lebih tinggi dari 3,71. 

Pada percobaan ini kita akan mencoba menerjemahkan skenario di atas ke dalam sebuah aplikasi sederhana yang memanfaatkan interface. 

1. Pada **project yang sama,** buatlah sebuah package baru bernama **interfacelatihan.**

![Gambar Soal](img/19.PNG)

2. Pada package yang baru dibuat tersebut, tambahkan sebuah **interface** baru dengan cara klik kanan pada package **-> New -> Java Interface…** Beri nama interface baru tersebut dengan nama **ICumlaude.** 

![Gambar Soal](img/20.PNG)

3. Pada interface ICumlaude tersebut, tambahkan 2 abstract methods bernama **lulus()** dan **meraihIPKTinggi().** 

![Gambar Soal](img/21.PNG)

4. Berikutnya, buatlah sebuah class baru bernama **Mahasiswa** dengan baris-baris kode seperti dibawah ini. 

![Gambar Soal](img/22.PNG)

5. Selanjutnya, buatlah class baru bernama **Sarjana** yang merupakan **turunan** dari class Mahasiswa. Class Sarjana tersebut dibuat meng-**implements** interface ICumlaude yang sudah dibuat sebelumnya tadi. Ketikkan kode di bawah pada class tersebut. **Tips:** Anda dapat 

menggunakan fasilitas override otomatis dengan cara yang sama yaitu dengan mengklik ikon lampu peringatan seperti pada percobaan 1. 

![Gambar Soal](img/23.PNG)

6. Selanjutnya sesuaikan isi dari method **lulus()** dan **meraihIPKTinggi()** agar sama dengan baris kode di bawah. 

 ![Gambar Soal](img/24.PNG)

 Perhatikan pada baris kode di atas, class Sarjana meng-**extend** class Mahasiswa, ini berarti, **Sarjana adalah Mahasiswa** sementara itu agar semua objek dari class Sarjana ini nantinya dapat disebut sebagai **Cumlaude** maka ia harus meng-**implements** interface **ICumlaude.** 
 
 
7. Kemudian dengan **cara yang sama** buatlah class baru bernama **PascaSarjana** dengan baris kode seperti di bawah ini. 
 
  ![Gambar Soal](img/25.PNG)

8. Lalu buatlah sebuah class baru bernama **Rektor.** Class ini adalah class yang memanfaatkan classclass Mahasiswa yang telah dibuat sebelumnya. 

  ![Gambar Soal](img/26.PNG)

9. Terakhir, buatlah sebuah class baru bernama **Program** yang diletakkan pada **package yang sama** dengan class-class percobaan 2. Tambahlan baris kode berikut ini: 

  ![Gambar Soal](img/27.PNG)

10. Pada baris kode tersebut, apabila Anda mengetikkan semua class dengan benar, maka akan terdapat error dan class Program tidak dapat dieksekusi. Perbaikilah kode Anda agar program yang Anda buat mengeluarkan output seperti berikut ini: 

  ![Gambar Soal](img/28.PNG)

  **Hasil Percobaan 2**

  ![Gambar ICumlaude1841720146Bagus](img/b1.PNG)

  [ini link ke kode program ICumlaude1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan2/ICumlaude1841720146Bagus.java)

![Gambar Mahasiswa1841720146Bagus](img/b2.PNG)

  [ini link ke kode program Mahasiswa1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan2/Mahasiswa1841720146Bagus.java)

  ![Gambar Sarjana1841720146Bagus](img/b3.PNG)

[ini link ke kode program Sarjana1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan2/Sarjana1841720146Bagus.java)

  ![Gambar Sarjana1841720146Bagus](img/b4.PNG)

  [ini link ke kode program PascaSarjana1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan2/PascaSarjana1841720146Bagus.java)

![Gambar Rektor1841720146Bagus](img/b5.PNG)

  [ini link ke kode program Rektor1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan2/Rektor1841720146Bagus.java)

  ![Gambar MahasiswaMain1841720146Bagus](img/b6.PNG)

  [ini link ke kode program MahasiswaMain1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan2/MahasiswaMain1841720146Bagus.java)

   ![Gambar MahasiswaMain1841720146Bagus](img/b7.PNG)





  11. Pertanyaan diskusi:  
  
  a. Mengapa pada langkah nomor 9 terjadi error? Jelaskan! 
  
  b. Dapatkah method **kuliahDiKampus()** dipanggil dari objek **sarjanaCumlaude** di class **Program?** Mengapa demikian? 
  
  c. Dapatkah method **kuliahDiKampus()** dipanggil dari parameter **mahasiswa** di method **beriSertifikatCumlaude()** pada class **Rektor?** Mengapa demikian? 
  
  d. Modifikasilah method **beriSertifikatCumlaude()** pada class **Rektor** agar hasil eksekusi class **Program** menjadi seperti berikut ini: 

  ![Gambar Soal](img/29.PNG)

**Jawaban Pertanyaan diskusi Percobaan 2**

a.![Gambar jawaban nomor 9 terjadi error ](img/e1.PNG)

Karena Class mahasiswaBiasa tidak di deklarasikan atau tidak di buat di dalam packge Interface. Sehingga saat di panggil terjadi error 

b.![Gambar](img/e2.PNG)
  ![Gambar](img/e3.PNG)
  ![Gambar](img/e1.PNG)

bisa karena Sarjana1841720146Bagus extends Mahasiswa1841720146Bagus dan di class ICumlaude1841720146Bagus perlu menambahkan atribut kuliahDikampusBagus();

c.![Gambar Jawaban C](img/e1.PNG)  
 
![Gambar](img/e2.PNG)


Bisa jika suatu object memanggil method berSertifikatCumloude(). Dan terdapat parameter  
  dan di 

       public class Rektor1841720146Bagus {
        public void beriSertifikatCumlaude(ICumlaude1841720146Bagus       Mahasiswa1841720146Bagus){



d.   ![Gambar MahasiswaMain1841720146Bagus](img/b7.PNG)




**Percobaan 3: Multiple Interfaces Implementation**

Pada percobaan kali ini kita akan memodifikasi program yang telah dibuat pada Percobaan 2 sehingga pada program tersebut nantinya akan terdapat sebuah class yang meng-implements lebih dari 1 interface. 

![Gambar Soal](img/30.PNG)

Bayangkan pada skenario sebelumnya, dimana seorang rektor juga akan memberiSertifikatMawapres() pada sebuah acara wisuda. Mahasiswa yang berhak menerima penghargaan tersebut tentunya adalah mahasiswa yang berprestasi, dimana kriteria prestasi di sini
berbeda antara mahasiswa Sarjana dengan mahasiswa Pasca Sarjana. Pada percobaan ini, kita akan menentukan kriteria prestasi yaitu: harus **menjuaraiKompetisi()** dan **membuatPublikasiIlmiah().** 

1. Pada package **yang sama dengan package pada Percobaan 2,** tambahkan sebuah interface baru yang bernama **IBerprestasi.** Tambahkan baris kode seperti berikut didalamnya. 

![Gambar Soal](img/31.PNG)

2. Selanjutnya, **modifikasilah** class **PascaSarjana** dengan menambahkan interface baru **IBerprestasi** dibelakang kata kunci **implements.** Lalu dengan cara yang sama seperti sebelumnya, kliklah ikon lampu peringatan untuk **meng-generate** semua method abstract dari interface IBerprestasi pada class **PascaSarjana.** 

![Gambar Soal](img/32.PNG)

3. Modifikasilah method yang telah di-generate oleh NetBeans menjadi seperti berikut. 

![Gambar Soal](img/33.PNG)

4. Tambahkan method **beriSertifikatMawapres()** dengan baris kode seperti di bawah, pada class **Rektor.** 

![Gambar Soal](img/34.PNG)

5. Terakhir, modifikasilah method **main()** pada class **Program** Anda. Comment-lah semua baris yang terdapat method **beriSertifikatCumlaude(),** lalu tambahkan baris kode baru seperti pada gambar di bawah ini. 

![Gambar Soal](img/35.PNG)

6. Akan terdapat error pada langkah-5, sehingga program tidak dapat dieksekusi. Perbaikilah kode programmnya, sehingga hasil eksekusi menjad **sama** seperti pada screenshot di bawah ini. 

![Gambar Soal](img/36.PNG)

**Hasil Percobaan 3**


  ![Gambar P3_IBerprestasi1841720146Bagus](img/c1.PNG)

  [ini link ke kode program P3_IBerprestasi1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan3/P3_IBerprestasi1841720146Bagus.java)


 ![Gambar P3_ICumlaude1841720146Bagus](img/c2.PNG)

  [ini link ke kode program P3_ICumlaude1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan3/P3_ICumlaude1841720146Bagus.java)


  ![Gambar P3_Mahasiswa1841720146Bagus](img/c3.PNG)

  [ini link ke kode program P3_Mahasiswa1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan3/P3_Mahasiswa1841720146Bagus.java)


  ![Gambar P3_Sarjana1841720146Bagus](img/c4.PNG)

  [ini link ke kode program P3_Sarjana1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan3/P3_Sarjana1841720146Bagus.java)


  ![Gambar P3_PascaSarjana1841720146Bagus](img/c5.PNG)

  [ini link ke kode program P3_PascaSarjana1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan3/P3_PascaSarjana1841720146Bagus.java)


  ![Gambar P3_Rektor1841720146Bagus](img/c6.PNG)

  [ini link ke kode program P3_Rektor1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan3/P3_Rektor1841720146Bagus.java)


  ![Gambar P3_MahasiswaMain1841720146Bagus](img/c7.PNG)

 [ini link ke kode program P3_MahasiswaMain1841720146Bagus](../../src/9_Abstract_Class_dan_Interface/Percobaan3/P3_MahasiswaMain1841720146Bagus.java)

   ![Gambar P3_MahasiswaMain1841720146Bagus](img/c8.PNG)




7. Pertanyaan diskusi: Apabila **Sarjana Berprestasi** harus **menjuarai kompetisi NASIONAL** dan **menerbitkan artikel di jurnal NASIONAL,** maka modifikasilah class-class yang terkait pada aplikasi Anda agar di class **Program** objek **pakRektor** dapat memberikan sertifikat mawapres pada objek **sarjanaCumlaude.** 

![Gambar Soal](img/37.PNG)

**Hasil Pertanyaan diskusi Percobaan 3**

public void menjuaraiKompetisi(){         
  System.out.println("Saya telah menjuarai kompetisi NASIONAL"); 

  } 
  
  Dan  public void membuatPublikasiIlmiah(){         
    
    System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");

        } 
Setra pada class Sarjana tidak kita implements pada class IBerprestasi , lalu pada class program kita kerikkan 

    @Override pakRektor.
 
   beriSertifikatMawapres(sarjanaCumlaude); 
 
   (dimana ini memanggil dari class Sarjana) 
 
    @Override 
 
    pakRektor.beriSertifikatMawapres(masterCumlaude);   
 
    (dimana ini memanggil dari class Sertifikat) 
 
    serta pada class Sarjana kita ganti tulisannya  

    @Override 

    public void menjuaraiKompetisi(){         
  
    System.out.println("Saya telah menjuarai kompetisi NASIONAL");     
  
    } 
  
    @Override 
  
   public void membuatPublikasiIlmiah(){         
    
    System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");  
    
       } 
       
       Agar membedakan seperti pada contoh output di bawah ini  Dan pada class Program kita kerikkan seperti scrip di bawah ini 
       
        pakRektor.beriSertifikatMawapres(sarjanaCumlaude); 
        
                pakRektor.beriSertifikatMawapres(masterCumlaude);                  
                }     
                 }          
 




## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Bagus Satria Putra)***


 
 





 
 

 
 

 



 
 

 

 



 







 
 




 
 



 
 
 






























