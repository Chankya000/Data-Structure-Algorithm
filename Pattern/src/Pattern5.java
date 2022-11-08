// Question statement
//create a pattern for variable n like below
//n =5
//         *
//    *    *    *
//*   *    *    *   *
//    *    *    *
//         *

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        System.out.println("Please enter the value of n ");
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int st=1;
        int sp = n/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=st;k++){
                System.out.print("*\t");
            }

            if(i<=n/2){
                st=st+2;
                sp=sp-1;
            }else {
                st=st-2;
                sp=sp+1;
            }
            System.out.println();
        }

    }

}
