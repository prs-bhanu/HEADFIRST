package hf3;

public class XCopy {

    /*main method*/

        public static void main(String[] args) {
            /* declearing a variable */
            int orig = 42;
            /* creating an object*/
            XCopy x = new XCopy();
            /* passing a parameter */
            int y = x.go(orig);
            System.out.println(orig + " " + y);
        }
        /* it takes an integer argument*/
        int go(int arg) {
            /* doubles the value with multiolication */
            arg = arg * 2;
            /*returns the modified value*/
            return arg;
        }
    }