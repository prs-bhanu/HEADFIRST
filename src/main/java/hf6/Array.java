package hf6;

public class Array {
    public static void main (String[]args ){
        int []a = new int[3];
       int x=10;
       for (int i=0; i<a.length;i++){
           a[i]=x;
           x=x+10;
       }
        System.out.println(x);


    }
}
