import java.util.Scanner;

public class LargestNumberUntilZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Largest Number Until Zero");
        int largest=Integer.MIN_VALUE;
        int n;
        do{
            System.out.print("Enter the number: ");
            n=sc.nextInt();
            if(n>largest){
                largest=n;
            }
        }while(n!=0);
        System.out.println(largest);

    }
}
