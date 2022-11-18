// Question statement
//n =5
//    *               *
//    *               *
//    *       *       *
//    *    *     *    *
//    *               *


import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter value of n");
        int n= scn.nextInt();
        int mid = (n/2)+1;
        int rs=mid-1;
        int fs=mid+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<mid){
                    if(j==1 || j==n){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
                if(i==mid){
                    if (j==1 ||j ==mid || j == n){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
                if(i>mid && i!=n){
                    if(j==1||j==n||j==rs||j==fs){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
                if(i==n){
                    if(j==1||j==n){
                        System.out.print("*\t");
                    }else {
                        System.out.print("\t");
                    }
                }
            }
            if(i>mid){
                --rs;
                ++fs;
            }
            System.out.println();
        }
    }
}
