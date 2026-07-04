package pseudoFlowChartPrograms;
import java.util.Scanner;

public class InputTillX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the X inputs and display the sum of it..");
        int sum=inputSum(sc);

        System.out.println("Sum: "+sum);
        
    }
    public static int inputSum(Scanner sc){
        int sum=0;
        
        while(true){
            System.out.print("Enter the number (or X to stop): ");
            String in=sc.next();
            if(in.equalsIgnoreCase("X")){
                break;
            }
            sum += Integer.parseInt(in);
        }
        return sum;
    }
}
