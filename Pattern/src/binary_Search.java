import java.sql.SQLOutput;
import java.util.Scanner;

//calculate the mid
public class binary_Search {

    public static void main(String[] args) {
        System.out.println("Please enter the number of elements");
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element in ascending order");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("enter number to search");
        int digit=scn.nextInt();
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid= (l+h)/2;
            if(arr[mid]>digit){
                h=mid-1;
            }else if(arr[mid]<digit){
                l=mid+1;
            }
            else{
                System.out.println("Found at "+mid);
                return;
            }
        }
        System.out.println("Not found");
    }
}
