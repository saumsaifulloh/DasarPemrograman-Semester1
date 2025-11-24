import java.util.Scanner;

public class modifikasiArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs]; 
        double totalNilaiLulus = 0;
        double totalNilaiTidakLulus = 0;
        int jumlahLulus = 0;
        int batasLulus = 70; 
       
        for(int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        
        for(int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > batasLulus) { 
                jumlahLulus++;
                totalNilaiLulus += nilaiMhs[i];
            } else {
                totalNilaiTidakLulus += nilaiMhs[i];
            }
        }
        
        int jumlahTidakLulus = nilaiMhs.length - jumlahLulus;
        
        double rata2Lulus = 0;
        if (jumlahLulus > 0) {
            rata2Lulus = totalNilaiLulus / jumlahLulus;
        }

        double rata2TidakLulus = 0;
        if (jumlahTidakLulus > 0) {
            rata2TidakLulus = totalNilaiTidakLulus / jumlahTidakLulus;
        }
        
       
        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.printf("Rata-rata nilai lulus = %.1f\n", rata2Lulus);
        System.out.printf("Rata-rata nilai tidak lulus = %.1f\n", rata2TidakLulus);

        sc.close();
    }
}