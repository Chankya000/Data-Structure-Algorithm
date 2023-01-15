import java.util.Scanner;

// find the saddle point in a matrix , minimum in a row , maximum in a column
public class saddle_price {
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
        for(int i=0;i<arr.length;i++){
            int svj=0;
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][j]<arr[i][svj]){
                    svj=j;
                }
            }

            boolean flag = true;
            for(int k=0;k<row;k++){
                if(arr[k][svj]>arr[i][svj]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("Invalid ");

    }
}
