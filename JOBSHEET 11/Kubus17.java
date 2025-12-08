public class Kubus17 {

    public double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Kubus17 kubus = new Kubus17();
        double sisi = 5;

        System.out.println("Sisi kubus: " + sisi);
        System.out.println("Volume kubus: " + kubus.hitungVolume(sisi));
        System.out.println("Luas permukaan kubus: " + kubus.hitungLuasPermukaan(sisi));
    }
}
