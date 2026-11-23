import java.text.DecimalFormat;

public class Balkendiagramm {
    public static void main(String[] args) throws Exception {
        System.out.print("Wie viele Kandidaten sind noch im Rennen? ");
        int mal = IO.readInteger();
        double [] wert = new double[mal];
        System.out.println("Erfassen Sie jetzt die prozentwale Verteilung des Votings:");
        for (int i = 0; i < mal; i++) {
            System.out.print("Kandidat " + (i + 1) + ": ");
            wert[i] = IO.readDouble();
        }
        System.out.println("Ergebnis");
        for (int i = 0; i < mal; i++) {
            System.out.print("kardinat " + (i + 1) + ": ");
            for (int j = 0; j < wert[i]; j++) {
                System.out.print("*");
            }
            System.out.println(" " + wert[i] + "%");
        }
    }
}
