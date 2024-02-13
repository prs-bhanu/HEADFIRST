package HF1;

public class Comment {


    // Function to print a and c
    //comment the line that outputs b
    int a = 5, b = 6, c = 15;

    static void comment(int a, int b, int c) {

        //Prints a
        System.out.println(a);
        //Prints c
        System.out.println(c);

        /*this b will not be printed
        System.out.println(b)
         */
    }
}