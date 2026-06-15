import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Area of Circle");
        System.out.print("Please enter the radius: ");
        float r=sc.nextFloat();

        double area=Math.PI * (r*r);
        System.out.println(area);
    }
}