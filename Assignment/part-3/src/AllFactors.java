import java.util.Scanner;

public class AllFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the All Factor of number");
        System.out.print("Please enter the number: ");
        int n=sc.nextInt();

        for (int i = 1; i < n; i++) {
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
