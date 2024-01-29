package HF1;

public class Shufel {
    //*MAIN METHOD*//
    public static void main(String[] args) {
        //*DECLARING THE VARIABLE //
        int x = 3;
        // loop CONDITION STATEMENTS//
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 2) {
                System.out.print("b c");
            }
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
            // END OF CONDITION STATEMENTS//
        }
    }
}