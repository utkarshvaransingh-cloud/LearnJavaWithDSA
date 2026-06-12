import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series...");
        System.out.print("Enter the end number of the series: ");
        int num=sc.nextInt();
        int first=0, second=1;
        // if(num<=0) System.out.println(first);
        // if(num<2) System.out.print(second);

        while (first<=num) {
            System.out.print(first+" ");
            int next=first+second;
            first=second;
            second=next;
        }
    }
}