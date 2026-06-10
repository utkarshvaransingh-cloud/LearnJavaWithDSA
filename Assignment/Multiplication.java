import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Program of Multiplication Tables");
        System.out.print("Please enter the number: ");
        int num=sc.nextInt();
        int i=1;
        while (i<=10) {
            System.out.println(num+" * "+i+ " = "+(num*i));
            i++;
        }
    }
}
