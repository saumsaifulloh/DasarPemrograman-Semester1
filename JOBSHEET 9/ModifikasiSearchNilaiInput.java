import java.util.Scanner;

public class ModifikasiSearchNilaiInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya nilai yang akan di input: ");
        int n = sc.nextInt();
        
        int[] arrNilai = new int[n]; 
        System.out.println("Masukkan nilai:");
        for(int i = 1; i <= arrNilai.length; i++) {
            System.out.print("Mahasiswa ke-" + i + " : ");
            arrNilai[i-1] = sc.nextInt();
        }
        
        System.out.print("\nMasukkan nilai yang ingin dicari (key): ");
        int key = sc.nextInt();
        
        int hasilIndeks = -1; 
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasilIndeks = i; 
                break;
            }
        } 
        
        System.out.println();
        if (hasilIndeks != -1) {
            System.out.println("Nilai " + key + " Nilai ketemu, Merupakan Mahasiswa ke-" + (hasilIndeks + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }
        
        sc.close();
    }
}