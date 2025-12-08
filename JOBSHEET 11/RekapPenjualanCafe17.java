import java.util.*;

class RekapPenjualanCafe17 {

    String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

    int[][] penjualan = {
            {20, 20, 25, 20, 10, 60, 10},  
            {30, 80, 40, 10, 15, 20, 25},  
            {5, 9, 20, 10, 25, 5, 45},     
            {50, 8, 17, 18, 10, 30, 6},    
            {15, 10, 16, 8, 10, 10, 55}    
    };

    public void tampilData() {
        System.out.println("\n=== Rekap Penjualan Kafe ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + " : ");
            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void menuTertinggi() {
        int max = -1;
        String menuMax = "";

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }

            if (total > max) {
                max = total;
                menuMax = menu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi: " + menuMax + " (" + max + ")");
    }

    public void rataRataMenu() {
        System.out.println("\n=== Rata-rata Penjualan Setiap Menu ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) total += penjualan[i][j];

            double rata = (double) total / 7;
            System.out.println(menu[i] + " : " + rata);
        }
    }

    public static void main(String[] args) {
        RekapPenjualanCafe17 cafe = new RekapPenjualanCafe17();

        cafe.tampilData();
        cafe.menuTertinggi();
        cafe.rataRataMenu();
    }
}
