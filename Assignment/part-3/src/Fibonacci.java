import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the fibonacci");
        System.out.print("Please enter the number upto series to be printed: ");
        int n=sc.nextInt();

        int a=0, b=1;
        while (n>0) {
            System.out.print(a+ ", ");
            int next=a+b;
            a=b;
            b=next;
            n--;
        }
        
    }
}
