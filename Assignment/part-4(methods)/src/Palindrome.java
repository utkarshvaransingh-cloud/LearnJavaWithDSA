import java.net.Socket;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Palindrome Checker");
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        boolean palin=reverse(n);
        if(palin){
            System.out.println("It's Palindrome");
        }else{
            System.out.println("It's Not Palindrome");
        }
    }
    static boolean reverse(int num){
        int origin=num;
        int rev=0;
        while (num>0) {
            int digit = num % 10;
            rev=(rev*10)+digit;
            num/=10;
        }

        return rev==origin;
    }
}
