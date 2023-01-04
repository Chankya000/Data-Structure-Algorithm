import java.util.Scanner;

//input a array and reverse it
public class reverse_array {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int temp =0;
        for(int i=0,j= arr.length-1;i<n/2;i++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
