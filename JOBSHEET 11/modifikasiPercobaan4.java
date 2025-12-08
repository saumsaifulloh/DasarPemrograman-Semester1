import java.util.Scanner;

public class modifikasiPercobaan4 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("=== DAFTAR PENGUNJUNG CAFE ===");

        if (namaPengunjung.length == 0) {
            System.out.println("(Tidak ada pengunjung)");
        }

        for (String nama : namaPengunjung) {
            System.out.println(" - " + nama);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Andi", "Budi", "Citra", "Dewi");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");

        daftarPengunjung();
    }
}
