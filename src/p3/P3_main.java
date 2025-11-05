package p3;

public class P3_main {
    public static void main(String[] args) {
        //Aufgabe 1
        int i = 23;
        i = Math.abs(i);
        System.out.println("Der Betrag von i ist: " + i);

        //Aufgabe 2
        int j = 4;
        j = j * j;
        System.out.println("Das Quadrat von Wert j ist: " + j);

        //Aufgabe 3
        int k = 32;

        if (k % 2 == 0) {
            System.out.println("Der Wert von k ist gerade!");
        }
        else {
            System.out.println("Der Wert von k ist ungerade!");
        }
    }
}
