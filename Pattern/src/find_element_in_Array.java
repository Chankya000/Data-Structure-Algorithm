import java.util.Scanner;

//find element in array
public class find_element_in_Array {
    public static void main(String[] args) {
        System.out.println("Please enter the number of elements");
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println("Please enter the elements");
        int[] arr = new int[n];
        for(int i =0;i< arr.length;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Enter the numeber to search");
        int num=scn.nextInt();
        for(int i= 0;i< arr.length;i++){
            if(arr[i]==num){
                System.out.println("Found at "+i);
                return;
            }
        }
        System.out.println(-1);
    }

}
