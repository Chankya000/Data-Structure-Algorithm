// Question statement
//create a pattern for variable n like below
//n =5
//     *                    *
//          *           *
//                *
//          *           *
//     *                     *


// to be worked on
import java.util.Scanner;

public class Pattern9 {

    public static void main(String[] args) {
        System.out.println("Please enter the value of n");
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int isp=(n/2)+1;
        int osp = 0;
        for(int i=1;i<=n;i++){
            //display outer space
            for(int o =0;o<osp;o++){
                System.out.print("\t");
            }
            //display first star
            System.out.print("*\t");

            //display inner space
            for(int j=1;j<=isp;j++){
                System.out.print("\t");
            }

            //display second star conditionally
            if(i!=(n/2)+1){
                System.out.print("*\t");
            }
                if(i<=n/2){
                    isp=isp-2;
                    ++osp;
                }else{
                    isp=isp+2;
                    --osp;
                }
            System.out.println();
        }
    }
}
