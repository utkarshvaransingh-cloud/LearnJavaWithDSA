import java.util.Scanner;

public class CubeTotalSurfaceArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Total Surface Area of Cube");
        System.out.print("Please enter the side: ");
        float s=sc.nextFloat();

        double tsa=6*Math.pow(s, 3);
        System.out.println(tsa);
    }
}
