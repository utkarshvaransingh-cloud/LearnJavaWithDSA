import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Sum Until user enter Zero");
    
        int sum=0, n;
        do{
        System.out.print("Please enter the number: ");
        n=sc.nextInt();
        sum+=n;
        }while(n!=0);
        System.out.println(sum);
        
    }
}
