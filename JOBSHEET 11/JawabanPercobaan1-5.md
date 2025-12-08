Percobaan 1

Apakah fungsi tanpa parameter selalu harus bertipe void?
Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!
Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.
Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).
Percobaan 2

Apakah kegunaan parameter di dalam fungsi?
Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?
Apakah parameter sama dengan variabel? Jelaskan
Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?
Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?
Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.
Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.
Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.
Percobaan 3

Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.
Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.
Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)?
Percobaan 4

Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... namaPengunjung!
Modifikasi method daftarPengunjung menggunakan for-each loop.
Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?
Percobaan 5

Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!
Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.
Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!
Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan!
Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5.
Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume.
Jawab

Percobaan 1

Tidak, fungsi tanpa parameter bisa menggunakan void maupun return
Sudah
Kode terkesan lebih rapi karena dapat mengelompokkan berbagai perintah
Program membaca main > perintah main adalah untuk menuju ke fungsi menu > fungsi menu menampilkan menu sebagai output
Percobaan 2

Digunakan untuk memberi value pada fungsi
Sebagai value untuk memberi perintah tambahan untuk ditampilkan
Parameter digunakan sebagai value yang harus diisi agar fungsi berjalan, sedangkan variabel hanya value yang akan diisi berdasarkan kegunaannya
jika true maka akan mendapat diskon tambahan 10% sesuai perintah, jika false maka tidak mendapat
Error
Sudah
Menu("budi", true, "diskon30");
iya, karena isi utama dalam fungsi langsung bisa terbaca dari pada tanpa perameter yang harus di cek satu persatu
Percobaan 3

Program memerlukan return jika isinya berupa penjumlahan namun hasilnya ditampilkan di fungsi main. Contohnya: parameter dari fungsi hitungTotalHarga memberi value yang akan dijumlahkan sesuai operasi yang akan menampilakan HargaTotal sesuai yang di return
Tipe data dari kembalian disesuaikan dengan tipe data dari hitungTotalHarga, jika salah satu int maka yang lain juga harus sama. Parameter pilihanMenu meminta user untuk memilih menu mana yang dipesan dengan jumlahPesanan sebagai banyaknya jumlah yang dipesan
Sudah
Sudah
Percobaan 4

TipeData... Digunakan agar parameter menyesuaikan dengan berapa banyak value yang ada
Sudah
Tidak bisa, karena aturannya hanya memperbolehkan satu varargs
Tidak error, namun karena tidak diisi maka tidak ada yang ditampilkan
Percobaan 5

Jika menggunakan fungsi maka: program membaca fungsi main > input p,l dan t > masuk ke fungsi HitungLuas(4, 2) > fungsi hitungLuas menghitung dan mengembalikan nilainya > menampilakan Luas di fungsi main > masuk ke fungsi hitungVolume(5, 4, 2) > mengitung p = 5, l = 4, t = 2 dan memgembalikan nilai totalnya > menampilkan hitungVolume ke fungsi main
Fungsi main > hitungBalok(4, 3, 5) > hitung 435 = 60 dan return > kembali ke main dan tampilkan sebagai output
Fungsi main > temp = jumlah(1, 1) > fungsi jumlah me return 1+1=2 > TampilJumlah(2, 5) > tampilHinggaKei(7) > looping j = 1: j <= 7; j++ print(j) > output = 1234567
Butuh parameter jika membutuhkan nilai yang harus dipanggil dari main, butuh kembalian jika kita melakukan operasi di fungsi lain tapi ingin menampilkan di fungsi main
Boleh tidak menggunakan parameter asal mendeklarasikan value p,l,t di dalam fungsi atau jika diluar fungsi dengan menambahkan static
Boleh tidak menggunakan return asal menggunakan void yang berarti menampilkan output dari fungsi tersebut