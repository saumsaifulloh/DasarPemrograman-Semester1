public class modifikasiBioskop17 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        penonton[0][0] = "amin";
        penonton[0][1] = "bena";
        penonton[1][0] = "candra";
        penonton[1][1] = "dela";
        penonton[2][0] = "eka";
        penonton[2][1] = "farhan";
        penonton[3][0] = "gisel";
        penonton[3][1] = "hadi"; 

       System.out.println("penonton pada baris ke-3: ");

       for(int i = 0; i < penonton.length; i++) {
               System.out.println("penonton baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]) );
           }
       }
    }
