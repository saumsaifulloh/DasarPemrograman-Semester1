import java.util.Scanner;

public class BioskopWhiteScanner17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] penonton = new String [4][2];
        String Nama;
        int Baris;
        int Kolom;
        String next;
       while (true) {
            System.out.print("Masukkan Nama: ");
            Nama = sc.nextLine();
            System.out.print("Masukkan Baris:");
            Baris = sc.nextInt();
            System.out.print("Masukkan KOlom: ");
            Kolom = sc.nextInt();
            sc.nextLine();

            penonton [Baris -1 ][Kolom -1 ] = Nama;

            System.out.print("Input penonton lainnya? (Y/N): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("N")) {
                break;
            }
       }
    }
    
}