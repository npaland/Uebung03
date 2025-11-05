package p2;

public class P2_main {
    public static void main(String[] args) {
        int a = 50;
        int b = 50;
        int c = 100;
        int d = 23;

        d = 0;
        //E1
        if (a == b){
            d = d +1;
        }
        //E2
        if (a == b || a == c) {
            d = d +1;
        }
        //E3
        if ((a + b) >= c) {
            d = d + 1;
        }
        //E4
        if ((a + b + c) >= 100) {
            d = d + 1;
        }

        System.out.println("Startwerte: a=" + a + ", b=" + b + ", c=" + c + ".");
        System.out.println("Anzahl der erfüllten Eigenschaften (d): " +d);
    }
}
