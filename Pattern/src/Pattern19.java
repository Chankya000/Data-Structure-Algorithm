// Question statement
//n =5
//    *   *   *       *
//            *       *
//    *   *   *   *   *
//    *       *
//    *       *   *   *


import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {

        System.out.println("Please enter the value of n");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mid = (n/2)+1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){
                if(i==1){
                    if(j<=mid || j == n){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }

                if(i>1 && i <mid){
                    if(j==mid || j ==n){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
                if(i==mid){
                    System.out.print("*\t");
                }
                if(i<n &&i >mid){
                    if(j==mid || j==1){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
                if(i==n){
                    if(j==1 || j>=mid){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }

                }
            }
            System.out.println();
        }
    }
}
