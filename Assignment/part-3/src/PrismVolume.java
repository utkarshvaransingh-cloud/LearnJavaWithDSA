import java.util.Scanner;

public class PrismVolume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Volume of the Prism");
        System.out.print("Please enter the Base Area: ");
        float ba=sc.nextFloat();
        System.out.print("Please enter the Height: ");
        float h=sc.nextFloat();

        double area=(ba*h);
        System.out.println(area);
    }
}
