// Question statement
//create a pattern for variable n like below fibonacci series
//n =5

//        1
//    2   3   2
//3   4   5   4    3
//    2   3   2
//        1


import java.util.Scanner;

public class Pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the value of n");
        int n=scn.nextInt();
        int startValue=1;
        int jval=1;
        int sp=n/2;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            int printVal=startValue;
            for(int j=1;j<=jval;j++){
                if(j<=jval/2){
                    System.out.print(printVal+"\t");
                    ++printVal;
                }else{
                    System.out.print(printVal+"\t");
                    --printVal;
                }

            }
            if(i<=n/2){
                sp--;
                jval=jval+2;
                startValue++;
            }else {
                sp++;
                jval=jval-2;
                startValue--;
            }
            System.out.println();
        }

    }
}
