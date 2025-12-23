import java.util.Scanner;


public class Percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();

       int hasilFungsi =  hitungPangkat(bilangan, pangkat);

       String tampilan_1 = "hitungPangkat" + "(" + bilangan + "," + pangkat + ")" + " " + "dicetak" + " ";
       String tampilan_2 = "1" + "" + " = "+ hasilFungsi;

        System.out.print(tampilan_1);
       for (int i = 0; i < pangkat ; i++) {
           System.out.print( bilangan + " x ");
       }
        System.out.print(tampilan_2);

        sc.close();
    }

    static int hitungPangkat(int x , int y){
        if (y==0) {
            return (1);
        } else {
          int hasil =  x * hitungPangkat(x, y-1);
            return hasil;
        }
    }
}