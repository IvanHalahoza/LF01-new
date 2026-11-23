import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vedoppeln {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        System.out.println("Bitte geben Sie ein Array bestehend aus Kommazahlen ein:");
        System.out.print("Wie viele Werte? ");
        String text = br.readLine();
        int mal = Integer.parseInt(text);
        double[] wert = new double[mal];
        for (int i = 0; i < mal; i++) {
            System.out.print("Wert " + (i + 1) + " eingeben: ");
            text = br.readLine();
            wert[i] = Double.parseDouble(text.replace(',', '.'));
        }
        System.out.println("Ursprüngliches Array:");
        for (int i = 0; i < mal; i++) {
            System.out.print(wert[i] + "\t\t");
        }
        System.out.println();
        System.out.println("Verdoppeltes Array:");
        for (int i = 0; i < mal; i++) {
            System.out.print((wert[i] * 2) + "\t\t");
        }

    }
}
