import java.util.Scanner;

public class Interest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Simple Interest Calculator");
        System.out.print("Please enter the Principal: ");
        float principal=sc.nextFloat();
        System.out.print("Please enter the rate: ");
        float rate=sc.nextFloat();
        System.out.print("Please enter the time in years: ");
        float time=sc.nextFloat();

        float Interest=(principal * rate * time)/100;
        System.out.print("Interst: "+Interest); 

        sc.close();
    }
}
