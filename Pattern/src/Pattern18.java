// Question statement
//create a pattern for variable n like below fibonacci series
//n =7
//*   *   *   *   *   *   *
//    *               *
//        *       *
//            *
//        *   *   *
//    *   *   *   *   *
//*   *   *   *   *   *   *

import java.util.Scanner;

public class Pattern18 {

    public static void main(String[] args) {
        System.out.println("Please enter the value of n");
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        int st = n;
        int sp =0;
        for(int i=1;i<=n;i++){

            for(int k=1;k<=sp;k++){
                System.out.print("\t");
            }

            for(int j=1;j<=st;j++){
                if(i>1 &&  i<=n/2 && j>1 && j<st ){
                    System.out.print("\t");
                } else{
                    System.out.print("*\t");
                }
            }


            if(i<(n/2)+1){
                ++sp;
                st=st-2;
            }else{
                --sp;
                st=st+2;
            }
            System.out.println();
        }


    }


}
