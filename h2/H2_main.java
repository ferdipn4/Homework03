public class H2_main {
    public static void main(String[] args) {
        
        boolean x = false;
        boolean y = false;
        boolean a = false;
        boolean b = false;
        boolean c = false;
        int input= 10;

        if (input == 10 || input == 11){
            x = true;
        } else {
            x = false;
        }
        if (input == 1 || input == 11){
            y = true;
        } else {
            y = false;
        }

        if ( x && y){
            a = true;
        } else {
            a = false;
        }
        
        if ( x || (x != y)){
            b = true;
        } else {
            b = false;
        }



        if ( x && y == true){
            c = false;
        } else if ( x == true && y == false){
            c = true;
        } else if ( x == false && y == true){
            c = false;
        } else if ( x == false && y == false){
            c = true;
       
    }
}
}
