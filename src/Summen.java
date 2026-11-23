import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Summen {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("Bitte geben Sie ein Array bestehend aus Kommazahlen ein:");
        System.out.print("Wie viele Werte? ");
        String text = br.readLine();
        int mal = Integer.parseInt(text);
        int [] wert = new int[mal];
        for (int i = 0; i < mal; i++) {
            System.out.print("Wert " + (i + 1) + " eingeben: ");
            text = br.readLine();
            wert[i] = Integer.parseInt(text.replace(',', '.'));
        }
        int anzahlGerade = 0;
        int summeGerade = 0;
        int anzahlUngerade = 0;
        int summeUngerade = 0;
        for (int i = 0; i < mal; i++) {
            if (wert[i] % 2 == 0) {
                anzahlGerade += 1;
                summeGerade += wert[i];
            }
            if (!(wert[i] % 2 == 0)) {
                anzahlUngerade += 1;
                summeUngerade += wert[i];
            }
        }
        System.out.println("Gerade Zahlen:");
        System.out.println("Anzahl\t = " + anzahlGerade);
        System.out.println("Summe\t = " + summeGerade);
        System.out.println("Ungerade Zahlen:");
        System.out.println("Anzahl\t = " + anzahlUngerade);
        System.out.println("Summe\t = " + summeUngerade);
    }
}
