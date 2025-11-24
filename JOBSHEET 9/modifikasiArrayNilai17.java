import java.util.Scanner;

public class modifikasiArrayNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int[] nilaiMhs = new int[10];

    for(int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+" : ");
        nilaiMhs[i] = sc.nextInt();
    }
        System.out.println("\n=== Status Kelulusan Mahasiswa ===");

        for(int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {  
                System.out.println("Nilai akhir ke-" + (i+1) + " adalah " + nilaiMhs[i] + " -> Lulus");
            } else {
                System.out.println("Nilai akhir ke-" + (i+1) + " adalah " + nilaiMhs[i] + " -> Tidak Lulus");
            }
        }
    }
}