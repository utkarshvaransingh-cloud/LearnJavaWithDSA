import java.util.Scanner;

public class ConeVolume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Volume of Cone");
        System.out.print("Please enter the radius: ");
        float r=sc.nextFloat();
        System.out.print("Please enter the Height: ");
        float h=sc.nextFloat();

        double vol=(1/3)*Math.PI*h*Math.pow(r, 2);
        System.out.println(vol);
    }
}
