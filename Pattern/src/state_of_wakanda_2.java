import java.util.Scanner;

public class state_of_wakanda_2 {

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
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    System.out.println(arr[i][j]);
                }
            }
        }
        for(int g=0;g<arr.length;g++){
            for(int i=0, j=g;j<arr.length;i++,j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
