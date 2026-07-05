import java.util.Scanner;

public class SumOfDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to program of Sum of Digits");
        System.out.print("Please enter the number:");
        int num=sc.nextInt();

        int sum=digitSum(num);
        System.out.println("Sum of digits: "+sum);
    }
    public static int digitSum(int num){
        int sum=0;
        while (num>0) {
            int dig=num%10;
            sum+=dig;
            num/=10;
        }
        return sum;
    }
}