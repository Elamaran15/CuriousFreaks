package org.code.Week2;
//https://www.geeksforgeeks.org/problems/pattern-printing1347/1?page=1&category=pattern-printing&sortBy=submissions

//Given a number N. The task is to print a series of asterisk(*) from 1 till N
// terms with increasing order and difference being 1.


//Input:
//N = 3
//Output:
//* ** ***
//Explanation:
//First, print 1 asterisk then space after
//that print 2 asterisk and space after that
//print 3 asterisk now stop as N is 3.
public class PatternPrintingGFG {

    static void printPattern(int N){
        for(int i=1;i<=N;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        printPattern(3);
    }

}
