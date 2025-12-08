
import java.util.Scanner;

public class Kafe17 {
    public static void menu(String namaPelangan, boolean isMember) { 
        System.out.println("Selama datang, " + namaPelangan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("=== MENU RESTO KAFE ===");
        System.out.println("1. Kopi Hitam   -   : Rp 15.000");
        System.out.println("2. Cappuccino   -   : Rp 20.000");
        System.out.println("3. Latte        -   : Rp 22.000");
        System.out.println("4. Teh Tarik    -   : Rp 12.000");
        System.out.println("5. Roti bakar   -   : Rp 10.000");
        System.out.println("6. Mie Goreng   -   : Rp 18.000");
        System.out.println("===============================");
        System.out.println("Silakan pilih menu yang anda inginkan.");
    }
        public static int hitungTotalHarga(int PilihanMenu, int banyakItems) {
        int [] HargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    
        int hargaTotal = HargaItems[PilihanMenu -1] * banyakItems;
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu("Andi", true);
    
        System.out.print("\nMasukan menu yang ingin anda pesan: ");
        int PilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItems = sc.nextInt();

        int totalHarga = hitungTotalHarga(PilihanMenu, banyakItems);
        System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);

        sc.close();
    }
}
        
