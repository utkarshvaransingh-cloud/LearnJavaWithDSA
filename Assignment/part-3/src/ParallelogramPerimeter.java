import java.util.Scanner;

public class ParallelogramPerimeter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Parallelogram Perimeter");
        System.out.print("Please enter the 1st side: ");
        float a=sc.nextFloat();
        System.out.print("Please enter the 2nd Adjacent side: ");
        float b=sc.nextFloat();

        Double prei=2*(a+b);
        System.out.println(prei);
    }
}