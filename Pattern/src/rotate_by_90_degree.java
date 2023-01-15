// rotate the matrix by 90 degrees

import java.util.Scanner;

public class rotate_by_90_degree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row= scn.nextInt();
        int col = scn.nextInt();
        int[][] arr = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int[][] ans = new int[row][col];
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<arr[0].length-1;j++){
                ans[j][i]=arr[i][j];
            }
        }
    }

}
