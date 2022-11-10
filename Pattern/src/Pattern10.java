// Question statement
//create a pattern for variable n like below
//n =5
//     *                    *
//          *           *
//                *
//          *           *
//     *                     *


import java.util.Scanner;

public class Pattern10 {

    public static void main(String[] args) {
        System.out.println("Please enter the value of n");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int osp = n/2;
        int isp=-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=osp;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int j=1;j<=isp;j++){
                System.out.print("\t");
            }
            if(i>1 && i<n){
                System.out.print("*\t");
            }

            if(i<=n/2){
                --osp;
                isp=isp+2;
            }else{
                ++osp;
                isp=isp-2;
            }
            System.out.println();
        }
    }
}
