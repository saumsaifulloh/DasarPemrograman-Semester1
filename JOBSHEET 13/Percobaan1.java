public class Percobaan1 {
    public static void main(String[] args) {
        System.out.println(FaktorialRekrusif(5));
        System.out.println(FaktorialIteratif(5));
    }

    public static int FaktorialRekrusif(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * FaktorialRekrusif(n - 1);
        }
    }

    public static int FaktorialIteratif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }
}