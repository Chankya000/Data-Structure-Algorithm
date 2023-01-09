import java.util.Scanner;

//find the first and last index position of repetitie occurence in ascending order array
//10 20 20 20 30 40 50 50
public class first_last_index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("here");
        int num=scn.nextInt();
        int fi=0,li=0;
        int low=0,high=n-1;
        int mid=0;
        while (low<high){
            mid=(low+high)/2;
            if(num>arr[mid]){
                low=mid+1;
            }else if(num<arr[mid]){
                high=mid-1;
            }else{
                System.out.println("mid is"+mid);
                int dig1=mid;
                int dig2=mid;
                while((mid-1)>=0 && arr[mid-1]==num ){
                    fi=--dig1;
                    mid=mid-1;
                }
                mid=dig2;
                li=mid;
                System.out.println("mid and dig2"+mid+" "+dig2);
                while ((mid+1)<= arr.length-1 && arr[mid+1]==num){
                    System.out.println("dig2 is"+dig2);
                    li=++dig2;
                    mid=mid+1;
                }
            }
            ++low;
            --high;
        }
        System.out.println("fi "+fi+" li "+li);
    }
}
