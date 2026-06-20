import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Welcome to the program of Odd/Even Checker");
        System.out.print("Please enter the number: ");
        int n=sc.nextInt();
        
        if(isEven(n)==true){
            System.out.println("Your number is even");
        }else{
        System.out.println("Your number is odd");
        }


    }
    public static boolean isEven(int n){
        if(n%2!=0)  return false;

        return true;
    }
}
