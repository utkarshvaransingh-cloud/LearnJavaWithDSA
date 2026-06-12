import java.util.Scanner;

public class Largest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the  Largest number");
        System.out.print("Please enter the 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Now, please enter the 2nd number: ");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("Largest number is: "+num1);
        }else{
            System.out.println("Largest number is: "+num2);
        }
    }
}   