// Question statement
//create a pattern for variable n like below fibonacci series
//n =4
//0
//1   1
//2   3   5
//8   13   21   34



import java.util.Scanner;

public class Pattern12 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a int value");
        int n = scn.nextInt();
        int numOne=0;
        int numTwo=1;
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(numOne+"\t");
                int c = numOne+numTwo;
                numOne=numTwo;
                numTwo=c;

            }
            System.out.println();
        }

    }

}
