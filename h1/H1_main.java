public class H1_main {

    public static void main(String[] args) {

        double guthaben = -100;
        double monEingang = 200;
        int rating = -2;
        boolean warnhinweis = false;
        boolean negativ = false;

        if (guthaben < 0) {
            negativ = true;
            if (Math.abs(monEingang) >= Math.abs(guthaben)) {
                rating = rating + 1;
            } else {
                rating = rating - 1;
            }
        } else if (guthaben > 0) {
            rating = rating + 3;
        } else {
            rating = rating + 2;
        }

        if (guthaben < 0 && Math.abs(monEingang) < Math.abs(guthaben) && rating < 0) {
            warnhinweis = true;
        } else {
            warnhinweis = false;
        }
    }
}
