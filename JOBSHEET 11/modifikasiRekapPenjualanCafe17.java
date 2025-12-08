import java.util.Scanner;

class modifikasiRekapPenjualanCafe17 {

    String[] menu;
    int[][] penjualan;

    public void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jmlHari = sc.nextInt();

        menu = new String[jmlMenu];
        penjualan = new int[jmlMenu][jmlHari];

        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }

        for (int i = 0; i < jmlMenu; i++) {
            System.out.println("\nInput penjualan untuk " + menu[i]);
            for (int j = 0; j < jmlHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    public void tampilData() {
        System.out.println("\n=== Rekap Penjualan ===");

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + " : ");
            for (int j = 0; j < penjualan[i].length; j++) {
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
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }

            if (total > max) {
                max = total;
                menuMax = menu[i];
            }
        }

        System.out.println("\nMenu dengan total penjualan tertinggi: " + menuMax + " (" + max + ")");
    }

    public void rataRataMenu() {
        System.out.println("\n=== Rata-rata Penjualan Setiap Menu ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }

            double rata = (double) total / penjualan[i].length;
            System.out.println(menu[i] + " : " + rata);
        }
    }

    public static void main(String[] args) {
        modifikasiRekapPenjualanCafe17 cafe = new modifikasiRekapPenjualanCafe17();

        cafe.inputData();
        cafe.tampilData();
        cafe.menuTertinggi();
        cafe.rataRataMenu();
    }
}
