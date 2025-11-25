import java.util.Scanner;

public class SurveyFlowchart {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int RESP = 10;   
        int Q = 6;       
        double[][] survey = new double[RESP][Q];

        for (int i = 0; i < RESP; i++) {
            System.out.println("Responden " + (i + 1));

            for (int j = 0; j < Q; j++) {
                System.out.print("Nilai pertanyaan " + (j + 1) + ": ");
                survey[i][j] = in.nextDouble();
            }
            System.out.println();
        }

        System.out.println("\n=== TOTAL PER RESPONDEN ===");

        for (int i = 0; i < RESP; i++) {
            double total = 0;
            for (int j = 0; j < Q; j++) {
                total += survey[i][j];
            }
            System.out.println("Total Responden " + (i + 1) + " = " + total);
        }

        System.out.println("\n=== RATA-RATA PER PERTANYAAN ===");

        for (int j = 0; j < Q; j++) {
            double total = 0;

            for (int i = 0; i < RESP; i++) {
                total += survey[i][j];
            }

            double rata = total / RESP;
            System.out.println("Rata-rata Pertanyaan " + (j + 1) + " = " + rata);
        }

        System.out.println("\n=== TOTAL SEMUA NILAI SURVEI ===");

        double totalSemua = 0;
        for (int i = 0; i < RESP; i++) {
            for (int j = 0; j < Q; j++) {
                totalSemua += survey[i][j];
            }
        }

        System.out.println("Total Semua Nilai Survei = " + totalSemua);
        System.out.println("\nProgram Selesai.");
        in.close();
    }
}