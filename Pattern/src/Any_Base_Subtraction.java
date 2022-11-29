//subtraction of two number in any base

import java.util.Scanner;

public class Any_Base_Subtraction {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2){
        // write your code here
        int p=1;
        int c =0;
        int rv=0;
        while(n1>0||n2>0||c>0){
            int dig1=n1%10;
            int dig2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int subt=dig1-dig2+c;
            if(subt<0){
                c=-1;
                subt=subt+b;
            }else{
                c=0;
            }
            rv=rv+subt*p;
            p=p*10;
        }
        return rv;
    }

}