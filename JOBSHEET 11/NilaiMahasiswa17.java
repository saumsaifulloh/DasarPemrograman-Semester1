import java.util.Scanner;

public class NilaiMahasiswa17 {
    public void isianArray(double[] nilai) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
        }
    }

    public void tampilArray(double[] nilai) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    public double hitTot(double[] nilai) {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = input.nextInt();


        double[] nilai = new double[N];

        NilaiMahasiswa17 nm = new NilaiMahasiswa17();

        nm.isianArray(nilai);
        nm.tampilArray(nilai);

        double total = nm.hitTot(nilai);
        System.out.println("\nTotal nilai seluruh mahasiswa = " + total);
    }
}
