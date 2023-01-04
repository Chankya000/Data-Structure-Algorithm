import java.util.Scanner;

public class inverse_of_array {

    public static void main(String[] args) {
        System.out.println("Please enter the length of array");
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[] a = new int[n];
        System.out.println("Please enter the numbers");
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int[] b = new int[a.length];
        for(int i=0;i<b.length;i++){
            b[a[i]]=i;
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
