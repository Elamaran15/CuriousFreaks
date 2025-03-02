package org.code.Week2;

public class Patterns {

    //1 2 3 4
    //1 2 3 4
    //1 2 3 4
    //1 2 3 4
    static void patternOne(int n){
        for (int i=0;i<n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

  //1
  //1 2
  //1 2 3
  //1 2 3 4
    static void patternTwo(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    //1234
    //123
    //12
    //1
    static void patternFive(int n){
        for (int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    //* * * * *
    //* * * *
    //* * *
    //* *
    //*
    static void patternSix(int n){
     for(int i=0;i<=n;i++){
         for(int j=0;j<n-i;j++){
             System.out.print("* ");
         }
         System.out.println();
     }
    }

 //5 4 3 2 1
 //4 3 2 1
 //3 2 1
 //2 1
 //1
    static void patternSeven(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //*
    //**
    //***
    //****
    //*****
    static void patternEight(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//*
//**
//***
//****
//*****
//****
//***
//**
//*
    static void patternNine(int n){
        for(int i=1;i<=(n*2)-1;i++) {
            if (i >= n) {
                //****
                //***
                //**
                //*
                for (int j =(n*2)-i; j>0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }







    public static void main(String[] args) {
        patternNine(5);
    }
}
