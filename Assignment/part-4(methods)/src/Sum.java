import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The sum of two number");
        System.out.print("Please enter the first number: ");
        float n1=sc.nextFloat();

        System.out.print("Please enter the second number: ");
        float n2=sc.nextFloat();

        System.out.println("Sum of two number are: "+sum(n1, n2));
        

    }
    static float sum(float a, float b){
        float sum=a+b;
        return sum;
    }
}
