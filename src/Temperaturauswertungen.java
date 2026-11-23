import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Temperaturauswertungen {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        DecimalFormat df = new DecimalFormat("#,##0.00");

        boolean weiter = true;

        do {
            System.out.println("Bitte geben Sie die Anzahl der Tagen: ");
            String text = br.readLine();
            int tageAnzahl = Integer.parseInt(text.replace(',', '.'));

            double[] tage = new double[tageAnzahl];

            double maxTemperatur = 0;
            double minTemperatur = 0;
            double differenz;
            double maxDifferenz = 0;

            for (int i = 0; i < tage.length; i++) {
                System.out.print("Bitte geben Sie die Temperatur an Tag " + (i + 1) + " ein: ");
                text = br.readLine();
                tage[i] = Double.parseDouble(text.replace(',', '.'));
                if (i == 0 || maxTemperatur < tage[i]) {
                    maxTemperatur = tage[i];
                }
                if (i == 0 || minTemperatur > tage[i]) {
                    minTemperatur = tage[i];
                }
                if (i > 0) {
                    differenz = tage[i - 1] - tage[i];
                    if (differenz < 0) {
                        differenz = differenz * -1;
                    }
                    maxDifferenz = Math.max(maxDifferenz, differenz);
                }
            }

            double summe = 0;
            for (int i = 0; i < tage.length; i++) {
                summe += tage[i];
            }
            double mittelwert = summe / tage.length;

            System.out.println("Mittelwert\t\t\t:" + df.format(mittelwert));
            System.out.println("Maximale Temperatur\t:" + df.format(maxTemperatur));
            System.out.println("Minimale Temperatur\t:" + df.format(minTemperatur));
            System.out.println("Spannweite\t\t\t:" + (df.format(maxTemperatur - minTemperatur)));
            System.out.println("Maximale Differenz\t:" + df.format(maxDifferenz));
            System.out.println("Wollen Sie weiter berechnen? [j] [n] ");
            String angabe = br.readLine();
            if (angabe.equals("j") || angabe.equals("ja")) {
                weiter = true;
            } else if (angabe.equals("n") || angabe.equals("nein")) {
                weiter = false;
            }
        } while (weiter);
    }
}
