import java.util.Scanner;

public class CommisionPercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Commision: ");
        double commision=sc.nextDouble();
        System.out.print("Enter the Total Sales: ");
        double totalSales=sc.nextDouble(); 

        double commisionPercent=(commision/totalSales)*100;

        System.out.println("commision % "+ commisionPercent);
    }
}
