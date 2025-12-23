import java.util.Scanner;

public class PrestasiMahasiswa17 {
    public static void main(String[] args) {

        // Scanner untuk input dari user
        Scanner sc = new Scanner(System.in);

        // Array 2 dimensi untuk menyimpan data prestasi
        // [baris] = jumlah data, [kolom] = atribut prestasi
        // Kolom: 0=Nama, 1=NIM, 2=Jenis, 3=Tingkat, 4=Tahun, 5=Alamat
        String[][] dataPrestasi = new String[10][10];

        int jumlahData = 0;

        // Variabel untuk pilihan menu
        int menu;

        // Perulangan menu utama
        do {
            System.out.println("\n=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
            System.out.println("4. Cari Data Peserta Berdasarkan Tahun");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {

                // MENU 1: Tambah data prestasi
                case 1:
                    System.out.println("\n=== TAMBAH DATA PRESTASI ===");

                    // Input nama mahasiswa
                    System.out.print("Nama Mahasiswa: ");
                    dataPrestasi[jumlahData][0] = sc.nextLine();

                    // Input NIM
                    System.out.print("NIM: ");
                    dataPrestasi[jumlahData][1] = sc.nextLine();

                    // Input jenis prestasi
                    System.out.print("Jenis Prestasi: ");
                    dataPrestasi[jumlahData][2] = sc.nextLine();

                    //input alamat
                    System.out.print("Alamat: ");
                    dataPrestasi[jumlahData][3] = sc.nextLine();

                    // Validasi tingkat prestasi
                    String tingkat;
                    while (true) {
                        System.out.print("Tingkat Prestasi (Lokal/Nasional/Internasional): ");
                        tingkat = sc.nextLine();
                        if (tingkat.equalsIgnoreCase("Lokal") ||
                            tingkat.equalsIgnoreCase("Nasional") ||
                            tingkat.equalsIgnoreCase("Internasional")) {
                            break;
                        } else {
                            System.out.println("Tingkat prestasi tidak valid!");
                        }
                    }
                    dataPrestasi[jumlahData][4] = tingkat;

                    // Validasi tahun prestasi
                    int tahun;
                    int tahunMaks = 2024;
                    while (true) {
                        System.out.print("Tahun Prestasi (2010 - " + tahunMaks + "): ");
                        tahun = sc.nextInt();
                        sc.nextLine(); 
                        if (tahun >= 2010 && tahun <= tahunMaks) {
                            break;
                        } else {
                            System.out.println("Tahun tidak valid!");
                        }
                    }

                    // Simpan tahun sebagai String
                    dataPrestasi[jumlahData][6] = Integer.toString(tahun);

                    jumlahData++;
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                // MENU 2: Menampilkan semua data prestasi
                case 2:
                    System.out.println("\n=== DAFTAR SEMUA PRESTASI ===");
                    if (jumlahData == 0) {
                        System.out.println("Belum ada data prestasi.");
                    } else {
                        for (int i = 0; i < jumlahData; i++) {
                            System.out.print((i + 1) + ".");
                            System.out.print(" Nama: " + dataPrestasi[i][0]);
                            System.out.print(" | NIM: " + dataPrestasi[i][1]);
                            System.out.print(" | Jenis: " + dataPrestasi[i][2]);
                            System.out.print(" | Tingkat: " + dataPrestasi[i][3]);
                            System.out.print(" | Tahun: " + dataPrestasi[i][4]);
                            System.out.print(" | Alamat: " + dataPrestasi[i][5]);
                            System.out.println();
                        }
                    }
                    break;

                // MENU 3: Analisis prestasi berdasarkan jenis
                case 3:
                    System.out.println("\n=== ANALISIS PRESTASI BERDASARKAN JENIS ===");
                    if (jumlahData == 0) {
                        System.out.println("Belum ada data untuk dianalisis.");
                    } else {
                        System.out.print("Masukkan Jenis Prestasi yang ingin dianalisis: ");
                        String jenis = sc.nextLine();
                        boolean ditemukan = false;

                        // Mencari prestasi berdasarkan jenis
                        for (int i = 0; i < jumlahData; i++) {
                            if (dataPrestasi[i][2].equalsIgnoreCase(jenis)) {
                                ditemukan = true;
                                System.out.print("\nPrestasi ke-" + (i + 1));
                                System.out.print(" Nama: " + dataPrestasi[i][0]);
                                System.out.print(" | NIM: " + dataPrestasi[i][1]);
                                System.out.print(" | Tingkat: " + dataPrestasi[i][3]);
                                System.out.print(" | Tahun: " + dataPrestasi[i][4]);
                                System.out.print(" | Alamat: " + dataPrestasi[i][5]);
                            }
                        }
                        break;
                    }

                // MENU 4 : Mencari data peserta berdasarkan tahun
                case 4:
                    System.out.println("\n=== CARI DATA PESERTA BERDASARKAN TAHUN ===");
                    if (jumlahData == 0) {
                        System.out.println("Belum ada data untuk dicari.");
                    } else {
                        System.out.print("Masukkan tahun peserta yang ingin dicari: ");
                        String tahunCari = sc.nextLine();
                        int ditemukan = 0;
                        // Mencari data peserta berdasarkan tahun
                        for (int i = 0; i < jumlahData; i++) {
                            if (dataPrestasi[i][4].equalsIgnoreCase(tahunCari)) {
                                ditemukan++;
                                System.out.print((i + 1) + ".");
                                System.out.print(" Nama: " + dataPrestasi[i][0]);
                                System.out.print(" | NIM: " + dataPrestasi[i][1]);
                                System.out.print(" | Jenis: " + dataPrestasi[i][2]);
                                System.out.print(" | Tingkat: " + dataPrestasi[i][3]);
                                System.out.print(" | Tahun: " + dataPrestasi[i][4]);
                                System.out.print(" | Alamat: " + dataPrestasi[i][5]);
                                System.out.println();
                            }
                        }
                        if (ditemukan == 0) {
                            System.out.println("Data peserta dengan tahun " + tahunCari + " data dtemukan.");
                        }
                    break;
                }

                // MENU 5: Keluar dari program
                case 5:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                // Jika menu tidak valid
                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (menu != 4);

        // Menutup Scanner
        sc.close();
    }
}
