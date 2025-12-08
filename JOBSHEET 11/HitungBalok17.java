import java.util.Scanner;

public class HitungBalok17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int panjang, lebar, tinggi, luas, volume;

        System.out.print("Masukkan panjang balok: ");
        panjang = input.nextInt();

        System.out.print("Masukkan lebar balok: ");
        lebar = input.nextInt();    

        System.out.print("Masukkan tinggi balok: ");
        tinggi = input.nextInt();

        luas = hitungLuas(panjang, lebar);
        System.out.println("Luas persegi panjang : " + luas);

        volume = hitungVolume(panjang, lebar, tinggi);
        System.out.println("Volume balok : " + volume);

        input.close();
    }

    public static int hitungLuas(int p, int l) {
        return p * l;
    }
    public static int hitungVolume(int p, int l, int t) {
        return hitungLuas(p, l) * t;
    }
}
