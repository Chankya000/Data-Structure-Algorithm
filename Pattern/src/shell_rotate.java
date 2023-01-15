// rotate the elements of array in shell s=1,2 in clockwise or anticlockwise maner

import java.util.Scanner;

public class shell_rotate {
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
        int s= scn.nextInt();
        int r = scn.nextInt();
        int[] oned =fillonedfromshell(arr,s);
        rotate(oned,r);
        fillshellfromoned(arr,s,oned);
    }
    public static int[] fillonedfromshell(int[][] arr, int s){

        int minr = s-1;
        int minc = s-1;
        int maxr=arr.length-1-s;
        int maxc= arr.length-1-s;

        int lw=maxr-minr+1;
        int bw=maxc-minc+1;
        int rw=maxr-minr+1;
        int tw=maxc-minc+1;
        int total_element =2*(maxr-minr)+2*(maxc-minc);

        int[] oned = new int[total_element];
        int idx=0;
        while(idx<total_element){
            //left wall
            for(int i=minr,j=minc;i<=maxr;i++ ){
                oned[idx]=arr[i][j];
                ++idx;
            }
            //bottom wall
            for(int i=maxr,j=minc+1;j<=maxc;j++){
                oned[idx]=arr[i][j];
                ++idx;
            }
            //right wall
            for(int i=maxr-1,j=maxc;i>=minr;i--){
                oned[idx]=arr[i][j];
                ++idx;
            }
            //top wall
            for(int i=maxc-1,j=minr;i>=maxc;i--){
                oned[idx]=arr[i][j];
                ++idx;
            }
        }

        return oned;
    }

    public static void rotate(int[] oned,int r){
        r = r%oned.length;
        if(r<0){
            r=r+ oned.length;
        }
        reverse(oned,0, oned.length-r-1 );
        reverse(oned, oned.length-r, oned.length-1);
        reverse(oned,0,oned.length-1);
    }

    public static void reverse(int[] oned , int li,int ri){
        while (li<ri){
            int temp = oned[li];
            oned[li]=oned[ri];
            oned[ri]=temp;
            ++li;
            --ri;
        }
    }
    public static void fillshellfromoned(int[][] arr,int s, int[] oned){
        int minr = s-1;
        int minc = s-1;
        int maxr=arr.length-1-s;
        int maxc= arr.length-1-s;

        int lw=maxr-minr+1;
        int bw=maxc-minc+1;
        int rw=maxr-minr+1;
        int tw=maxc-minc+1;
        int total_element =2*(maxr-minr)+2*(maxc-minc);

        int idx=0;
        while(idx<total_element){
            //left wall
            for(int i=minr,j=minc;i<=maxr;i++ ){
                arr[i][j]=oned[idx];
                ++idx;
            }
            //bottom wall
            for(int i=maxr,j=minc+1;j<=maxc;j++){
                arr[i][j]=oned[idx];
                ++idx;
            }
            //right wall
            for(int i=maxr-1,j=maxc;i>=minr;i--){
                arr[i][j]=oned[idx];
                ++idx;
            }
            //top wall
            for(int i=maxc-1,j=minr;i>=maxc;i--){
                arr[i][j]=oned[idx];
                ++idx;
            }
        }
        }


    }


