import java.util.Scanner;

public class SubtractProductAndSumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Subtract Product and Sum of Digits.. ");
        System.out.print("Please enter the number: ");
        int num=sc.nextInt();

        System.out.println(subtractProductAndSum(num));
    }

    static int subtractProductAndSum(int num){
        int sum=0, product=1;
        while (num>0) {
            int dig=num%10;
            sum+=dig;
            product*=dig;
            num/=10;
        }
        return product-sum;
    }
}
