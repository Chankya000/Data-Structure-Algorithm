//search in a sorted array

import java.util.Scanner;

public class search_in_sorted_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        //int col = scn.nextInt();
        int[][] arr = new int[row][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int x = scn.nextInt();
        int i=0;
        int j=arr.length-1;
        while(i<arr.length && j>=0){
            if(arr[i][j]==x){
                System.out.println("I is "+i+" j is "+j);
                return;
            }else if(x<arr[i][j]){
                j--;
            }else{
                ++i;
            }
        }
    }
}
