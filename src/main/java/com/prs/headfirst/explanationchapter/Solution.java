package com.prs.headfirst.explanationchapter;
import java.util.Scanner;
import java.util.*;
import java.lang.String.*;

    public class Solution {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i=42;
            double d=3.1415;
            String s= ("WelcomeToTheJavaTutorials!");


            i = scan.nextInt();
            d = scan.nextDouble();
            scan.nextLine();
             s= scan.nextLine();
            // Write your code here.

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
    }


