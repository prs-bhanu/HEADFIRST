package hf4;

public class Copy {
    /*main method*/
    public static void main (String[]args){
        /* declearing a variable */
        int orig =42;
        /* creating an object*/
        Copy x = new Copy();
        /* passing a parameter */
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }
    /* it takes an integer argument*/
    int go (int arg){
        /* doubles the value with multiolication */
        arg =arg*2;
        /*returns the modified value*/
        return arg;

    }
}
