//addition of two number in any base

import java.util.Scanner;

public class Any_Base_Addition {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2){
        // write ur code here

        int rv=0;
        int c=0;
        int p=1;
        while(n1>0 || n2>0 ||c>0) {
            int dig1 = n1 % 10;
            int dig2 = n2 % 10;
            n1=n1/10;
            n2=n2/10;
            int sum = dig1 + dig2 + c;
            c=sum/b;
            sum=sum%b;
            rv=rv+sum*p;
            p=p*10;

        }
        return rv;
    }
}
