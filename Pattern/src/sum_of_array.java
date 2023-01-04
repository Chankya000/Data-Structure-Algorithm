//add two arrays

import java.util.Scanner;

public class sum_of_array {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array1");
        int n1=scn.nextInt();
        System.out.println("Enter the number of elements");
        int[] arr1= new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=scn.nextInt();
        }
        System.out.println("enter the size of array 2");
        int n2=scn.nextInt();
        System.out.println("Please enter the number of elements");
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }

        int n3= Math.max(n1, n2);
        int[] ans =new int[n3];
        int sum=0;
        int carry=0;
        while (n3>0){
            n3--;
            n2--;
            n1--;

            if(n2<0){
                sum=arr1[n1]+carry;
            }else if(n1<0){
                sum=arr2[n2]+carry;
            }else{
                sum=arr1[n1]+arr2[n2]+carry;
            }
            if(sum>=10){
                sum=sum%10;
                carry=1;
            }else{
                carry=0;
            }
            ans[n3]=sum;

        }
        if(carry>0){
            System.out.println(carry);
        }
        for(int j=0;j< ans.length;j++){
            //System.out.println("herere");
            System.out.println(ans[j]);
        }
    }
}
