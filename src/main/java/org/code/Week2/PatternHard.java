package org.code.Week2;

public class PatternHard {


    //   *
    //  ***
    // *****
    //*******
    static void problemOne(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }

            for(int j=1;j<(i*2);j++){
                System.out.print("*");
            }

            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    static void problemTwo(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<i;space++){
                System.out.print(" ");
            }

            for(int start=1;start<=((n*2) -(2*i)-1);start++){
                System.out.print("*");
            }

            for(int space=1;space<i;space++){
                System.out.print(" ");
            }

            System.out.println();


        }
    }




//    static void problemThree(int n){
//        for(int i=1;i<n*2;i++) {
//            if (i<n) {
//                for (int space = 0; space < (n - i) - 1; space++) {
//                    System.out.print(" ");
//                }
//
//                for (int j = 1; j < ((i + 1) * 2); j++) {
//                    System.out.print("*");
//                }
//
//                for (int space = 0; space < (n - i) - 1; space++) {
//                    System.out.print(" ");
//                }
//
//                System.out.println();
//            }else{
//                for(int space=0;space<=(i-n);space++){
//                    System.out.print(" ");
//                }
//
//                int valid=((n+i)-(3*(i-3)));
//               for(int star=0;star<valid;star++){
//                   System.out.print("*");
//               }
//
//                for (int space = 0; space <=(i-n); space++) {
//                    System.out.print(" ");
//                }
//
//                System.out.println();
//            }
//        }
//    }

    static void problemThree(int n){
        //first half
        for(int i=1;i<n;i++){
            for(int space=1;space<n-i;space++){
                System.out.print(" ");
            }

            for(int star=1;star<2*i;star++){
                System.out.print("*");
            }

            for(int space=1;space<n-i;space++){
                System.out.print(" ");
            }

            System.out.println();
        }

        //for the second half
        for(int j=0;j<n;j++){
            for(int space=0;space<j;space++){
                System.out.print(" ");
            }

            for(int star=1;star<((2*n) - (2*j)-1);star++){
                System.out.print("*");
            }

            for(int space=0;space<j;space++){
                System.out.print(" ");
            }

            System.out.println();
        }

    }

    //1
    //23
    //456
    //78910
    //1112131415
    static void problemFour(int n){
        int value=0;
        for(int row=1;row<=n;row++){
            for(int j=1;j<=row;j++){
                System.out.print(++value);
            }
            System.out.println();
        }
    }

    //1
    //22
    //333
    //4444
    //55555
    static void problemFive(int n){
        int value=1;
        for(int row=1;row<=n;row++){
            for(int column=1;column<=row;column++){
                System.out.print(value);
            }
            value++;
            System.out.println();
        }
    }



    static void problemSix(int n){
        for(int row=1;row<=n;row++){
            int start= row%2==1 ? 1:0;

            for(int j=1;j<=row;j++){
                System.out.print(start);
                start= 1-start;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        problemSix(5);
    }
}
