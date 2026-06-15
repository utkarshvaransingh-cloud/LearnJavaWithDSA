import java.util.Scanner;

public class CylinderCurvedSurfaceArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Curved Surface Area of Cylinder");
        System.out.print("Please enter the radius: ");
        float r=sc.nextFloat();
        System.out.print("Please enter the height: ");
        float h=sc.nextFloat();
        
        double csa=2*Math.PI*r*h;
        System.out.println(csa);
    }
}
