//decimal to any base converter
// (634) decimal(10) to octal => (1172)8
// (34) decimal(10) to binary => (100010)2

import java.util.Scanner;

public class decimal_to_any_base {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        // write code here
            int num=0;
            int power=0;
        while (n>0){
            int rem = n%b;
            n=n/b;
            num = num+rem*(int) Math.pow(10,power);
            ++power;
            }
        return num;
    }

    }
