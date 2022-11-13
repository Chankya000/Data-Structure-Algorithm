// Question statement
//create a pattern for variable n like below fibonacci series
//n =4

//1                         1
//1   2                2    1
//1   2   3        3   2    1
//1   2   3    4   3   2    1


import java.util.Scanner;

public class Pattern16 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the value of n");
        int n= scn.nextInt();
        int row=n;
        int col = (2*n)-1;
        int sp = (2*n)-3;
        int statVal=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(statVal+"\t");
                ++statVal;
            }
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            --statVal;
            if(i==n){
                --statVal;
                for(int j=2;j<=i;j++){
                    System.out.print(statVal+"\t");
                    --statVal;
                }
            }else{
                for(int j=1;j<=i;j++){
                    System.out.print(statVal+"\t");
                    --statVal;
                }
            }

            sp=sp-2;
            statVal=1;
            System.out.println();
        }




    }
}
