import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the program of Factorial");
        System.out.print("Please enter the number: ");
        int n=sc.nextInt();
        long fact=factorial(n);
        System.out.println("Factorial of "+n+ ": "+fact);
    }
    static long factorial(int n){
        long fact=1;
        while (n>0) {
            fact*=n;
            n--;
        }
        return fact;
    }
}
