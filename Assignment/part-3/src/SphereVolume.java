import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Volume of Sphare");
        System.out.print("Please enter the radius: ");
        float r=sc.nextFloat();
        
        double vol=(4/3)*Math.PI*Math.pow(r, 3);
    }
}
