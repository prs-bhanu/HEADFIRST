package com.prs.headfirst.explanationchapter;

public class PassBy {
        public static void modifyValue(int x) {
            x = 42; // This only modifies the local copy of 'x'.
        }

        public static void main(String[] args) {
            int value = 10;
            modifyValue(value);
            System.out.println("Value after method call: " + value); // This will still print 10, not 42.
        }
    }

