import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to program of Fibonacci");
        System.out.print("Please enter the number: ");
        int num=sc.nextInt();

        fibonacci(num); 
    }
    public static void fibonacci(int num){
        int a=0;
        int b=1;
        while (num>0) {
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;
            num--;
        }
    }
}
