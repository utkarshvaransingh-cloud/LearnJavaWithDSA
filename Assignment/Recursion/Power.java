// package Assignment.Recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Base: ");
        int n=sc.nextInt();

        System.out.print("Exponent: ");
        int p=sc.nextInt();

        System.out.println("the power of "+n+" is: "+powLog(n,p));
    }

    // public static int pow(int n,int p){
    //     if(p==0) return 1;
    //     return n*pow(n, p-1);
    // }

    public static int powLog(int n, int p){
        if(p==1) return n;
        int call=powLog(n, p/2);
        if(p%2==0) return call*call;
        else return n*call*call;
    }
}
