import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Welcome to the program of Prime Number Checker");
        System.out.print("Please enter the number: ");
        int n=sc.nextInt();

        boolean prime=isPrime(n);
        if(prime){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }

    }
    static boolean isPrime(int n){
        if(n<=1) return false;
        int c=2;
        while (c*c <= n) {
        
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
