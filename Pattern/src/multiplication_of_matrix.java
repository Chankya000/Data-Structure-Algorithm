// multiply 2 2d arrays
/*

*/

import java.util.Scanner;

public class multiplication_of_matrix {
    public static void main(String[] args) {
        System.out.println("Enter row and col kength of matrix 1");
        Scanner scn = new Scanner(System.in);
        int row1= scn.nextInt();
        int col1=scn.nextInt();
        System.out.println("Enter matrix 1");
        int[][] arr1= new int[row1][col1];
        for (int i = 0; i < arr1.length; i++) {
            for(int j=0;j<arr1[0].length;j++){
                arr1[i][j]=scn.nextInt();
            }
        }
        System.out.println("Enter row and col length of matrix 2");
        int row2= scn.nextInt();
        int col2=scn.nextInt();
        System.out.println("Enter matrix 2");
        int[][] arr2= new int[row2][col2];
        for (int i = 0; i < arr2.length; i++) {
            for(int j=0;j<arr2[0].length;j++){
                arr2[i][j]=scn.nextInt();
            }
        }

        int k=0;
        int prod=0;
        if(col1!=row2){
            System.out.println("Cannot perform matrix multiplication");
        }else{
            int[][] ans = new int[row1][col2];
            for(int i=0;i<ans.length;i++){
                for(int j=0;j<ans[0].length;j++){

                    //ans[i][j]=arr1[i][j]*arr2[j][i] + ans[i][j];
                    while(k<row2){
                       prod=  arr1[i][k]*arr2[k][j] + prod;
                        ++k;
                    }
                    ans[i][j]=prod;
                    prod=0;
                    k=0;
                }
            }
            for(int i=0;i<ans.length;i++){
                for(int j=0;j<ans[0].length;j++){
                    System.out.println(ans[i][j]);
                }
            }

        }
    }
}
