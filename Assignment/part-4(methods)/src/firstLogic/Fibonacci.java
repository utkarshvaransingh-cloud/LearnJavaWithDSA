import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Fibonacci.");
        System.out.print("Please enter the number: ");
        int n=sc.nextInt();
        fibonacci(n);
    }
    public static void fibonacci(int num){
        int a=0, b=1;
        int i=1;
        while (i<=num) {
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;
            i++;
        }
    } 
} 