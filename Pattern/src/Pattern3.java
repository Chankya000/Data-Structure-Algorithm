// Question statement
//create a pattern for variable n like below
//n =5
//                  *
//              *   *
//         *    *   *
//    *    *    *   *
//*   *    *    *   *

import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter the value of n");
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("\t");
            }
            for( int k=1;k<=i;k++){
                System.out.print("*\t");
            }
            System.out.println();
        }


    }
}