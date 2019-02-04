package com.vasbinder.week3;
import java.util.Scanner;
/* Cameron Vasbinder
	Exercise 3
	1/31/19
	Takes f to c
	 */
public class Main {
    static void convertC(double c){
        c -= 32;
        c = c * 5 / 9;
        out(c);
    }

     static void out(double newtemp){
        System.out.println("your new temp is " + newtemp + " in c!");

    }

    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         double temp = 0;
         while(!(temp == -460)){
             System.out.println("Input a temp in F to convert to C. (-460 to exit");
             temp = scan.nextDouble();
             convertC(temp);

         }
     }
    }



