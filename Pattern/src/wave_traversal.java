// traverse in a wave from up and down and then move right
// at bottom and then go up and then move right and then go down till end of 2D array is reached

import java.util.Scanner;

public class wave_traversal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int element = row * col;
        int count = 0;
        int i = 0;
        int j = 0;
        while(count<col){
            if(j%2==0){
                while(i<=row-1){
                    System.out.println(arr[i][j]);
                    ++i;
                }
            }
         ++count;
            ++j;
            --i;
            if(j%2!=0){
                while(i>=0){
                    System.out.println(arr[i][j]);
                    --i;
                }
            }
            ++count;
            ++j;
            ++i;

        }
    }
}
