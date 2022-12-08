//find the span of an array

import java.util.Scanner;

public class span_of_Array {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the number of elements");
        int n=scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max-min);
    }

}
