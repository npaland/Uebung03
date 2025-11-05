package p1;

public class P1_main {
    public static void main(String[] args){
        int i = 3;

        if (i == 1) {
            System.out.println("Gewonnen!");
        }

        else if (i == 4) {
            System.out.println("Gewonnen!");
        }

        else if (i == 2) {
            System.out.println("Verloren!");
        }

        else if (i == 5) {
            System.out.println("Unentschieden!");
        }
        else {
            System.out.println("Keine eindeutige Antwort!");

        }
    }
}
