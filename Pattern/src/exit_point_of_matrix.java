import java.util.Scanner;

// find the exit point of a matrix
public class exit_point_of_matrix {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int row=scn.nextInt();
        int col=scn.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int i=0;
        int j=0;
        int dir=0; // 0-> east ,  1-> south , 2->west , 3->north
        while(true){
            dir = (dir+arr[i][j])%4;
            if(dir==0){
                ++j;
            }else if(dir==1){
                ++i;
            }else if(dir==2){
                --j;
            }else{
                --i;
            }
            if(i<0){
                ++i;
                break;
            }else if(j<0){
                ++j;
                break;
            }else if(i==arr.length){
                --i;
            }else if(j==arr.length){
                --j;
            }
        }
        System.out.println("i = "+i+" j = "+j);
    }
}
