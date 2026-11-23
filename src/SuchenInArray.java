import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SuchenInArray {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        double[] wert = new double[5];
        System.out.println("Bitte geben Sie ein Array bestehend aus 5 Kommazahlen ein.");
        for (int i = 0; i < 5; i++) {
            System.out.print("Wert " + (i + 1) + " eingeben: ");
            String text = br.readLine();
            wert[i] = Double.parseDouble(text.replace(',', '.'));
        }
        System.out.print("Nach welcher Zach wollen Sie suchen? ");
        String text = br.readLine();
        double zahl = Double.parseDouble(text.replace(',', '.'));
        for (int i = 0; i < 5; i++) {
            if (zahl == wert[i]) {
                System.out.println("Treffer");
            } else {
                System.out.println("Niete");
            }
        }
    }
}
