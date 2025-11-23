import java.util.Scanner;

public class Mengelolanilaimahasiswa17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Jumlah Mahasiswa: ");
        int jml = in.nextInt();

        int[] nilai = new int[jml];
        int total = 0;

        for (int i = 0; i < jml; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = in.nextInt();
            total += nilai[i];
        }

        int max = nilai[0];
        int min = nilai[0];

        for (int n : nilai) {
            if (n > max) max = n;
            if (n < min) min = n;
        }
        int posisiMax = 0; 
        int jumlahMax = 0;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == max) {
                jumlahMax++;
                if (jumlahMax == 1) {
                    posisiMax = i + 1; 
                }
            }
        }

        System.out.println("\n=== HASIL ===");
        for (int n : nilai) System.out.print(n + " ");

        System.out.println("\nRata-rata : " + (total / (double)jml));
        System.out.println("Tertinggi : " + max);
        System.out.println("Diperoleh oleh mahasiswa ke: " + posisiMax);
        System.out.println("Terendah  : " + min);
        System.out.println("Diperoleh oleh Mahasiswa ke: " + min);
    }
}