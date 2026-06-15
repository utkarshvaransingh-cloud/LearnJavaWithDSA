import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Area of Triangle");
        System.out.print("Please enter the Base: ");
        float b=sc.nextFloat();
        System.out.print("Please enter the Height: ");
        float h=sc.nextFloat();

        double area=(b*h)/0.5;
        System.out.println(area);

    }
}
