// Question statement
//create a pattern for variable n like below
//n =5
//*    *    *         *    *    *
//*    *                   *    *
//*                             *
//*    *                   *    *
//*    *    *         *    *    *


import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {
        System.out.println("Please enter the value of n");
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();

        int st=(n/2)+1;
        int sp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=st;j++) {
                System.out.print("*\t");
            }
            for(int k=1;k<=sp;k++){
                System.out.print("\t");
            }

            for(int j=1;j<=st;j++) {
                System.out.print("*\t");
            }
            if(i<=n/2){
                st=st-1;
                sp=sp+2;
            }else{
                st=st+1;
                sp=sp-2;
            }
            System.out.println();
        }

    }
}
