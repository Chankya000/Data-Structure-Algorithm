// Question statement
//create a pattern for variable n like below fibonacci series
//n =6
//1
//1   1
//1   2   1
//1   3   3   1
//1   4   6   4    1
//1   5   10  10   5    1

//this is a classic case of nc0 combincation caluclation


import java.util.Scanner;

public class Pattern13 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the value of n");
        int n= scn.nextInt();;
        for(int i=0;i<n;i++){
            int val=1;
            for(int j=0;j<=i;j++){
                System.out.print(val+"\t");
                int icjp1= val*(i-j)/(j+1);
                val=icjp1;
            }
            System.out.println();
        }
    }

}
