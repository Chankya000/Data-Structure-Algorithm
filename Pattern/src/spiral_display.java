//display a 4X4 matrix in spiral

import java.util.Scanner;

public class spiral_display {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int row=scn.nextInt();
        int col=scn.nextInt();
        int[][] arr  = new int[row][col];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int total_element=row*col;
        int minrow=0;
        int mincol=0;
        int maxrow=arr.length-1;
        int maxcol=arr.length-1;
        int cnt=0;
       while(cnt<total_element){

           // left wall
           for(int i=minrow,j=mincol;i<=maxrow && cnt<total_element;i++){
               System.out.println(arr[i][j]);
               ++cnt;
           }
           ++maxcol;

           //bottom wall
            for(int j=mincol,i=maxrow;j<=maxcol && cnt<total_element;j++){
                System.out.println(arr[i][j]);
                ++cnt;
            }
            --maxrow;

           //right wall
            for(int i=maxrow,j=maxcol;i>=minrow && cnt<total_element;i--){
                System.out.println(arr[i][j]);
                ++cnt;
            }
            --maxcol;

           //top wall
           for(int i=minrow,j=maxcol;j>=mincol && cnt<total_element;j--){
               System.out.println(arr[i][j]);
               ++cnt;
           }
           ++maxrow;
       }

    }
}
