import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The Product of two number");
        System.out.print("Please enter the first number: ");
        float n1=sc.nextFloat();

        System.out.print("Please enter the second number: ");
        float n2=sc.nextFloat();

        System.out.println("Product of two number are: "+product(n1, n2));
    }
    static float product(float a, float b){
        float mul=a*b;
        return mul;
    }
}
