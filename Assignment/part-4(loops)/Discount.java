import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the Original Price: ");
        int original=sc.nextInt();
        System.out.print("Please enter the Discount Percentage: ");
        float disPercent=sc.nextFloat();
        float discount=(original*disPercent)/100;

        float finalPrice=original-discount;
        System.out.println("Price  "+finalPrice);
    }
}
