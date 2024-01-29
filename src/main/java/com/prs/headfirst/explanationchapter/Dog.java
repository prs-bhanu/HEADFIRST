package com.prs.headfirst.explanationchapter;

public class Dog {

    // Main method //
    public static void main(String[] args) {
        Dog d = new Dog();

        //passing the value 3 ( in the method ) //

        d.bark(3);
    }


     //Bark method//
    void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            System.out.println("Bow Bow");
            numOfBarks = numOfBarks - 1;
        }

    }
}