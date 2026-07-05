import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Program of Palindrome Number");
        System.out.print("Please enter the number: ");
        int num=sc.nextInt();

        boolean palin=isPalindrome(num);
        if (palin) {
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrome");
        }
    }
    public static boolean isPalindrome(int num){
        int original=num;
        int rev=0;
        while (num>0) {
            int dig=num%10;
            rev=(rev*10)+dig;
            num/=10;
        }
        
        return original==rev;
    }
}
