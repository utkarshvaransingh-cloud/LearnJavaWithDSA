// package Assignment.Recursion;

import java.util.Scanner;

public class PowersOfNumbersReversePower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Base: ");
        int n=sc.nextInt();
        System.out.println("Reverse Exponents is: "+reverseExponentiation(n));
    }
    public static int powLog(int a,int b){
        if(b==0) return 1;
        int call=powLog(a, b/2);
        if(b%2==0) return call*call;
        else return a*call*call;
    }
    public static int reverseExponentiation(int n){
        // when the n is 1 to 10... 
        if(n==10) return 10; // 
        return powLog(n,n);
    }
}

