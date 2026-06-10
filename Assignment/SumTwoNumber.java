import java.util.Scanner;

public class SumTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the sum of two numbers");
        System.out.print("Please enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Now, please enter the second number:" );
        int num2=sc.nextInt();
        System.out.println("Hey, sum of two number is: "+ (num1+num2));
        
    }
}
