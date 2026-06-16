import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the point x1: ");
        double x1=sc.nextInt();
        System.out.print("Please enter the point y1: ");
        double y1=sc.nextInt();
        System.out.print("Please enter the point x2: ");
        double x2=sc.nextInt();
        System.out.print("Please enter the point y2: ");
        double y2=sc.nextInt();
        double distance=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println(distance +" unit");
    }
}
