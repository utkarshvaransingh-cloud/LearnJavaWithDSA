import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int perUnitCost=6;
        System.out.print("Please enter the unit consumed: ");
        int unitConsumed=sc.nextInt();
        int bill;
        int surCharges=200;
        if(unitConsumed<=100){
            bill=(unitConsumed*perUnitCost)+surCharges;
        }else if(unitConsumed<=200){
            bill=(100*6)+(unitConsumed-100)*7+surCharges;
        }else{
            bill=(100*6)+(100*7)+((unitConsumed-200)*10);
        }
        System.out.println(bill+" rs");
    }
}
