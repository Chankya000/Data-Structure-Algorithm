// Question statement
//create a pattern for variable n like below
//n =5
//                    *
//               *
//          *
//     *
//*


import java.util.Scanner;

public class Pattern8 {

    public static void main(String[] args) {
        System.out.println("Please enter the value of n");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("\t");
            }
            System.out.print("*");
            System.out.println();
        }

    }
}
