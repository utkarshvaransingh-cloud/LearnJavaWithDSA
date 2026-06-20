import java.util.Scanner;

public class CircleCrecumference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Welcome to the program of Circumference of Circle");
        System.out.print("Please enter the radius: ");
        float n=sc.nextFloat();
        System.out.println("Circumference of circle is: "+circumference(n));
    }

    static double circumference(float r){
        double cir=(float) 2*Math.PI*r;
        return cir;
    }
}
