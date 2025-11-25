import java.util.Scanner;

public class modifikasiBioskopWhiteScanner17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int menu;

        while (true) {
            System.out.println("\n===== MENU BIOSKOP =====");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {

                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();

                    System.out.print("Masukkan Baris (1-4): ");
                    int baris = sc.nextInt();

                    System.out.print("Masukkan Kolom (1-2): ");
                    int kolom = sc.nextInt();
                    sc.nextLine(); 

                    
                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Posisi kursi tidak valid!");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                    }
                    break;

                case 2:
                    System.out.println("\n===== DAFTAR PENONTON =====");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String isi = penonton[i][j];
                            if (isi == null) {
                                System.out.print("[KOSONG] ");
                            } else {
                                System.out.print("[" + isi + "] ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Program selesai. Terima kasih!");
                    return; 

                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
}
