import java.util.Scanner;

public class broken_economy {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int num=scn.nextInt();
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while (low<=high){
            mid=(low+high)/2;
            if(num>arr[mid]){
                low=mid+1;
            }else if(num<arr[mid]){
                high=mid-1;
            }else{
                System.out.println("ceil and floor are"+arr[mid]);
                return;
            }
        }
        System.out.println("The ceil and floor are "+arr[low]+" "+arr[high]);

    }
}
