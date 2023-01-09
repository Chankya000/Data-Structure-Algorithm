// array = {a,b,c}
/*
ans: { ___, __c , _b_ , _bc , a__ , a_c , ab_, abc }

 */

import java.util.Scanner;

public class subsets_of_array {
    public static void main(String[] args) {
        System.out.println("Please enter the length of array");
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr= new int[n];
        System.out.println("Please enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i]=scn.nextInt();
        }
        int num= (int) Math.pow(2,n);
        int i=0;
        while (i<num){
        String set = "";
        int temp=i;
        for(int j= arr.length-1;j>=0;j--){
            int rem = temp%2;
            temp=temp/2;
            if(rem==0){
                set="-"+set;
            }else{
                set=arr[j]+set;
            }
        }
            System.out.println(set);
            ++i;
        }
    }

}

