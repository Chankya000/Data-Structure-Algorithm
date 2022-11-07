// Question statement
//create a pattern for variable n like below
//n =5
//*   *    *    *   *
//    *    *    *   *
//         *    *   *
//              *   *
//                  *

import java.util.*;

import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the value of n");
        int n =scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i-1;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=(n-(i-1));k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }


}
