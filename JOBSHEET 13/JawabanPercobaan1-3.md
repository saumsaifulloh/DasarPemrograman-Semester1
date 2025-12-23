Percobaan 1
1. Apa yang dimaksud dengan fungsi rekursif?
2. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!
jawab:
Fungsi rekursif adalah sebuah fungsi yang terdapat perintah untuk memanggil fungsi itu sendiri (dirinya sendiri). Dengan demikian, proses pemanggilan fungsi akan terjadi secara berulang-ulang
Sama , perbedaan alur jalannya program antara fungsi rekursif dab fungsi iteratif adalah
a. Yang pertama, pada fungsi rekursif parameter yang ditampung di variabel n di validasi menggunakan condition berupa if else berupa jika n == 0 maka , nilai yang dikembalikan adalah 0. Sedangkan jika n !== 0 maka , recursion call dijalankan dengan n dikali dengan n-1 sampai dengan mendekati base case (n==0)
b. Yang kedua , pada fungsi iteratif terdapat deklarasi variabel faktor = 1 , dan parameter yang ditampung di variabel n kemudian di validdasi menggunakan perulangan pada fungsi ini , dengan i = n dan jika i lebih dari sama dengan 1 , kemudian variabel faktor tersebut dikalikan dengan i . Kemudian hasil dari perklalian tersebut dikembalikan dengan keyword return faktor.

Percobaan 2
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!
2. Tambahkan kode program untuk mencetak deret perhitungan pangkatnya. Contoh: hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32
Jawab:
1. Proses pemanggilan fungsi tersebut dijalankan sampai base case atau nilai batas terpenuhi atau sampai y==0
2. Sudah , ada di kode di bawah ini :
String tampilan_1 = "hitungPangkat" + "(" + bilangan + "," + pangkat + ")" + " " + "dicetak" + " "; String tampilan_2 = "1" + "" + " = "+ hasilFungsi;
 System.out.print(tampilan_1);
for (int i = 0; i < pangkat ; i++) {
    System.out.print( bilangan + " x ");
}
 System.out.print(tampilan_2);

 Percobaan 3
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!
2. Jabarkan trace fase ekspansi dan fase subtitusi algoritma perhitungan laba di atas jika diberikan nilai hitungLaba(100000,3)
jawab:
1. kode program base case: if (tahun == 0 ) { return (saldo); }
kode program recursion call : hitungLaba(saldo, tahun - 1)
2. Fase Ekspansi hitungLaba(100000, 3) = 1.11 * ( hitungLaba(100000, 2)) = 1.11 * ( hitungLaba(111000, 1)) = 1.11 * ( hitungLaba(123.210, 0))
Fase substitusi = 1.11 * 10000 = 1.11 * 111000 = 1.11 * 123.210 = 136.763