package hf2;
import java.util.Scanner;


public class Main {
    String  a="Hello";
    String b="World" ;
        public static void utility(String a, String b){
            //User function Template for Java

            System.out.println(a + " " + b);

        }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        scn.nextLine();
        while(t-- > 0) {
            String a = scn.nextLine();
            String b = scn.nextLine();
            utility(a,b);
        }
    }
}
