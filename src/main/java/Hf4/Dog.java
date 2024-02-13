
package Hf4;

// class is decleared//

public class Dog {

    //instance variables are deccleread int & size //
    int  size;
    String name;

   // bark method is decleared //
    void bark(){
        if (size>60){

            // size vairables are used in this bark method //

            System.out.println("woodf wooof ");
        }
        else if (size>20){
            System.out.println("Ruff Ruff");
        }
        else  {
            System.out.println("yip yip");
        }
    }

    // main method is decleared //
    public static void main(String[]args){

        // with a name of the  dog one a new oblect is created //
        Dog one = new Dog();
        one .size=90;
        Dog two = new Dog();
        two .size=15;
        Dog three = new Dog();
        three.size=21;
        one.bark();
        two.bark();
        three.bark();
    }
}
