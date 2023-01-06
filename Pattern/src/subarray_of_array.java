//find subarray of an array
// for n =3 elements = {1,2,3}
// 1
// 1 2
// 1 2 3
// 2
// 2 3
// 3

import java.util.Scanner;

public class subarray_of_array {
    public static void main(String[] args) {
        System.out.println("Please enter the length of array");
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements");
        for (int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                for(int k=i;k<j;k++){
                    System.out.print(arr[k]);
                }
                System.out.println();    //System.out.print(arr[i]);
            }

        }
    }
}
