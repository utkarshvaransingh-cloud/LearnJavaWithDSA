import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Program of Reverse Number");
        System.out.print("Please enter the number: ");
        int num=sc.nextInt();

        int reversed=reverse(num);
        System.out.println("Your reversed number: "+reversed);
    }
    public static int reverse(int num){
        int rev=0;
        while (num>0) {
            int dig=num%10;
            rev=(rev*10)+dig;
            num/=10;
        }
        return rev;
    }
}