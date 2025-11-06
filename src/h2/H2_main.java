package h2;

public class H2_main {
    public static void main(String[] args) {
        int jahr = 1900;
        boolean schalt;

        if ((jahr %4 == 0) && (jahr %100 != 0)) {
            schalt = true;
        }
        else if (jahr %400 == 0) {
            schalt = true;
        }
        else {
            schalt = false;
        }

        if (schalt == true) {
            System.out.println("Das Jahr: " + jahr + " ist ein Schaltjahr!");
        }
        else {
            System.out.println("Das Jahr: " + jahr + " ist kein Schaltjahr!");
        }
    }
}
