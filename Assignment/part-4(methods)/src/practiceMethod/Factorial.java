import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Program of Factorial");
        System.out.print("Please enter the number: ");
        int num=sc.nextInt();
        long fact=factorial(num);
        System.out.println("Factorial of your number: "+fact);
        System.out.println(Long.MAX_VALUE);
    }
    public static long factorial(int num){
        long fact=1;
        if(num<0) return -1;
        if(num==0 || num==1) return 1; 
        while (num>0) {
            fact*=num;
            num--;
        }
        return fact;
    }
}
