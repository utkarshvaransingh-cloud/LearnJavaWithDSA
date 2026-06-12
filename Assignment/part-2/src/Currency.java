import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Currency convetor");
        System.out.print("Enter the indian Rs: ");
        double rs=sc.nextDouble();
        double doller=rs *  0.0105025747;
        System.out.println(doller+" $");

    }
}