import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Volume of Cylinder");
        System.out.print("Please enter the radius: ");
        float r=sc.nextFloat();
        System.out.print("Please enter the Height: ");
        float h=sc.nextFloat();

        double vol=Math.PI*h*Math.pow(r, 2);
        System.out.println(vol);
    

    }
}
