public class H3_main {

    public static void main(String[] args) {
        int max = 5;
        int fix = 2;
        int wartend = 12;
        boolean istVoll = false;

        int freiePlaetze = max - fix;
        int zuweisen = Math.min(freiePlaetze, wartend);


        fix += zuweisen;
        wartend -= zuweisen;
        istVoll = (fix >= max);
        

    }


}
