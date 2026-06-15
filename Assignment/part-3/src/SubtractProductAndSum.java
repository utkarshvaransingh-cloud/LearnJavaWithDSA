import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Subtract Product And Sum of digit");
        System.out.print("Please enter the number: ");
        int n=sc.nextInt();
        int sum=0, product=1;
        while (n>0) {
            int digit=n%10;
            sum+=digit;
            product*=digit;
            n/=10;
        }
        System.out.println(product-sum);
    }
}
