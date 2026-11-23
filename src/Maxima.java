public class Maxima {
    public static void main(String[] args) throws Exception {
        System.out.println("Bitte geben Sie ein Array bestehend aus Kommazahlen ein:");
        System.out.print("Wie viele Werte? ");
        int mal = IO.readInteger();
        double [] wert = new double[mal];
        for (int i = 0; i < mal; i++) {
            System.out.print("Wert " + (i + 1) + " eingeben: ");
            wert[i] = IO.readDouble();
        }
        double max = 0;
        double max2 = 0;
        for (int i = 0; i < mal; i++) {
            max = Math.max(max, wert[i]);
        }
        for (int i = 0; i < mal; i++) {
            if (!(wert[i] == max)) {
                max2 = Math.max(max2, wert[i]);
            }
        }
        System.out.println("Größte Zahl: " + max);
        System.out.println("Zweigrßste Zahl: " + max2);
    }
}
