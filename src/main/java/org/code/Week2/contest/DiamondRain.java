package org.code.Week2.contest;

import java.util.Scanner;
//Rex loves diamonds and today he wants diamonds to be printed using code. He will give you a number n and you should print a diamond for him as below based on n.
//
//Input Format
//
//n = 5

//    *
//   ***
//  *****
// *******
//*********
//*********
// *******
//  *****
//   ***
//    *
public class DiamondRain {


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
       //print first half
        ////    *
        ////   ***
        ////  *****
        //// *******
        ////*********

        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }

            for(int star=1;star<2*i;star++){
                System.out.print("*");
            }
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //prints second half
        ////*********
        //// *******
        ////  *****
        ////   ***
        ////    *

        for(int j=1;j<=n;j++){
            for(int space=1;space<j;space++){
                System.out.print(" ");
            }

            for(int star=1;star<=((2*n) - ((2*j) -1));star++){
                System.out.print("*");
            }
            for(int space=1;space<j;space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
