public class H2_main {
    public static void main(String[] args) {

        int jahr = 100;
        boolean schalt = false;

        if ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) {
            schalt = true;
        } else {
            schalt = false;
        }
        
    }
}
