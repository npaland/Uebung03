package h1;

public class H1_main {
    public static void main(String[] args) {
        //aktuelles Guthaben = guthaben (double)
        //erwarteter Geldeingng / Monat = monEingang (double)
        //aktuelle Bewertung = rating (int)
        //resultierender Warnhinweis = warnhinweis (boolean)
        //Negativ = negativ (boolean)

        double guthaben = -1000;
        double monEingang = 500;
        int rating = 0;

        boolean warnhinweis = false;
        boolean negativ = true;

        monEingang = Math.abs(monEingang);

        if (guthaben < 0){
            negativ = true;
        } else {
            negativ = false;
        }

        if (guthaben > 0){
            rating = rating + 3;
        } else if (guthaben == 0){
            rating = rating +2;
            } else {
            if (monEingang >= Math.abs(guthaben)) {
                rating = rating + 1;
            } else {
                rating = rating - 1;
            }
        }

        if ((guthaben < 0) && (monEingang < Math.abs(guthaben)) && (rating < 0)){
            warnhinweis = true;
        } else {
            warnhinweis = false;
        }

        System.out.println("Das Rating ist: " + rating);

        if (warnhinweis == true) {
            System.out.println("Warnung!");
        }
    }
}
