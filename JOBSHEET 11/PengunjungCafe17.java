import java.util.Scanner;

public class PengunjungCafe17 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("=== DAFTAR PENGUNJUNG CAFE ===");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println(" - " +namaPengunjung[i]);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Andi", "Budi", "Citra", "Dewi");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
