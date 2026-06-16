import java.util.Scanner;

public class PowerProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double base=sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exp=sc.nextDouble();
        double result=base;
        for (int i = 1; i < exp; i++) {
            result*=base;
        }
        System.out.println(result);
    }
}
