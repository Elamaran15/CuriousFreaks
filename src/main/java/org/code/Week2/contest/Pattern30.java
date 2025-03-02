package org.code.Week2.contest;

import java.util.Scanner;


//Given an integer N, you need to print the following pattern.
//
//Input Format
//
//5

//12345
//22345
//33345
//44445
//55555
public class Pattern30 {


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();

        for(int row=1;row<=n;row++){
            int count=1;
            for(int j=1;j<=n;j++){
                if(j<= row){
                    System.out.print(row);
                    count++;
                }else{
                    System.out.print(count++);
                }
            }
            System.out.println();

        }
    }
}
