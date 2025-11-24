\\PERCOBAAN 1
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian? "EROR" KARENA INISIALISASINYA INT HARUSNYA DOUBLE"
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array "SUDAH"
3. Ubah statement pada langkah No 4 menjadi seperti berikut
    for(int i = 0; i < 4; i++)
        System.out.println(bil[i]);
    }
    Apa keluaran dari program? Jelaskan maksud dari statement tersebut. output yang keluar 
    5.0
    12867.0
    7.5
    2000000.0 perulangan for sampai 4 dan sesuai dengan inisialisasi array
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian? output yang keluar sama saja karena sama sama meminta ouput 4 array

\\PERCOBAAN 2
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:
    for(int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+" : ");
        nilaiMhs[i] = sc.nextInt();
    } "SUDAH"
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ? "nilai perulangan yang dapat di input sesuai berapa inisialisasi nilaiAkhir.length"
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai>70) "SUDAH" menambahkan statment  
System.out.println("\n=== Mahasiswa yang LULUS (nilai > 70) ==="); dan 
if (nilaiMhs[i] > 70) { 

4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus, seperti ilustrasi output berikut:"SUDAH"

\\PERCOBAAN 3
1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70). "SUDAH"
2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) sehingga program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan output seperti berikut ini: "SUDAH"

\\PERCOBAAN 4
1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas. "untuk menghentikan atau keluar paksa dari perulangan"
2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari. Contoh hasil program: "SUDAH"
3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan "Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array. Contoh tampilan program sebagai berikut: "SUDAH"