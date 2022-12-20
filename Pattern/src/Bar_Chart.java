//make a bar chart for the innut
//n=5
//2,1,4,0,1
/*
        *
        *
*       *
*   *   *       *
 */

import java.util.Scanner;

public class Bar_Chart {

    public static void main(String[] args) {
        System.out.println("Please enter the value of n and then the value of bars");
        Scanner scn  = new Scanner(System.in);
        int n =scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        for(int i=0;i<=max;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]+i==max+1){
                    --arr[j];
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
