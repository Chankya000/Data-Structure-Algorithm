// Question statement
//create a pattern for variable n like below fibonacci series
//n =5
//            *
//            *   *
//    *   *   *   *   *
//            *   *
//            *

import java.util.Scanner;

public class Pattern17 {

    public static void main(String[] args) {
        System.out.println("please enter the value of n");
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int sp = n/2;
        int star = (n/2)+1;
        int counter=1;
        for(int i=1;i<=n;i++){

            if(i==((n/2)+1)){
                for(int j=1;j<=sp;j++){
                    System.out.print("*\t");
                }
            }else{
                for(int j=1;j<=sp;j++){
                    System.out.print("\t");
                }
            }
            for(int k=1;k<=counter;k++){
                System.out.print("*\t");
            }

            if(i<(n/2)+1){
                ++counter;
            }else{
                --counter;
            }
            System.out.println();
        }


    }
}
