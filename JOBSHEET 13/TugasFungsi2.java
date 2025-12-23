import java.util.Scanner;

public class TugasFungsi2 {

    static Scanner inputAngka = new Scanner(System.in);

    public static int angkaRekursif(int input){
        if (input == 0) {
            return (0);
        }else{
            System.out.print("Masukkan angka ke " + input + " : ");
            int inputRekrusif = inputAngka.nextInt();
            int Total =+ inputRekrusif;
            
            return  Total + angkaRekursif(input-1);
        }

    }

    public static int angkaIteratif(int input) {
        int Total = 0;
        for (int i = input; i > 0; i--) {
            System.out.print("Masukkan angka ke - " + i + ": ");
            int inputTotal = inputAngka.nextInt();
            Total += inputTotal;
        }
        return Total;
    }       
    public static void main(String[] args) {

       System.out.print("Masukkan jumlah angka yang ingin dihitung (N) : ");
       int inputan = inputAngka.nextInt();

        System.out.println("Total dari " + inputan + " angka yang dimasukkan adalah : " + angkaRekursif(inputan));

        System.out.println("Total dari " + inputan + " angka yang dimasukkan adalah : " + angkaIteratif(inputan));
        
        inputAngka.close();
    }
}