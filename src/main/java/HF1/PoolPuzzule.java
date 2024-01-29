package HF1;
public class PoolPuzzule {
    //main method declearation //
        public static void main(String [] args) {
            //initializing the variable //
            int x = 0;

            //loop condition statement //
            while ( x < 4 ) {
                System.out.print("a");
                if ( x < 1 ) {
                    System.out.print(" ");
                }
                System.out.print("n");
                if ( x > 1 ) {
                    System.out.print(" oyster");
                    x = x + 2;
                }
                if ( x == 1 ) {
                    System.out.print("noys");
                }
                if ( x < 1 ) {
                    System.out.print("oise");
                }
                System.out.println();
                x = x + 1;
            }
            // end of loop condition statements//
        }
    }

