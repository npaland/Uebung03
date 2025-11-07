package h3;

public class H3_main {
    public static void main(String[] args) {
        int max = 5;
        int fix = 2;
        int wartend = 12;
        boolean istVoll;
        int freiePlaetze = max - fix;
        int zuweisungen = Math.min(wartend, freiePlaetze);

        if (fix > max) {
            System.out.println("Fehler! Es können nicht mehr Fixplätze: " + fix + " zugewiesen werden, wie es die maximale Anzahl: " + max + " erlaubt!");
        }
        else {
            fix = fix + zuweisungen;
            wartend = wartend - zuweisungen;

            istVoll = (fix == max);
            if (istVoll == true){
                System.out.println("Das Event ist voll! Ergebnis: Fixplätze vergeben: " + fix + ", Gäste auf der Warteliste: " + wartend);
            }
            else {
                System.out.println("Das Event ist noch nicht voll! Ergebnis: Fixplätze vergeben: " + fix + ", von maximal: " + max + " , Warteliste: " + wartend);
            }
        }
    }
}
