import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Palindrome checker");
        System.out.print("Please enter the number: ");
        int n=sc.nextInt();
        boolean palin=isPalindrome(n);
        if (palin) {
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrome");
        }

    }
    public static boolean isPalindrome(int num){
        int copy=num;
        int rev=0;
        while (num>0) {
            int digit=num%10;
            rev=(rev*10)+digit;
            num/=10;
        }
        
        return rev==copy;

    }
}
