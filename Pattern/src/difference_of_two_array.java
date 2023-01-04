//subtract 2 arrays

import java.util.Scanner;

public class difference_of_two_array {


    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
        System.out.println("Please enter size of array1");
        int n1=scn.nextInt();
        System.out.println("Please enter array 1 values");
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=scn.nextInt();
        }
        System.out.println("Please enter size of array2");
        int n2=scn.nextInt();
        System.out.println("Please enter array 2 values");
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }

        int n3= Math.max(n1, n2);
        int[] arr3 = new int[n3];
        int car=0;
        int dif=0;
        while (n3>0){
            n3--;
            n2--;
            n1--;
            if(n2<0){
                dif=arr1[n1]+car;
            }else{
                dif=arr1[n1]-arr2[n2]+car;
            }
            if(dif<0){
                dif+=10;
                car=-1;
            }else{
                car=0;
            }
            arr3[n3]=dif;
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
        }
}

}
