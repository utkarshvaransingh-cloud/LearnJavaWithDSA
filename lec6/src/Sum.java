import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        // return_type --> when a function finishes its call what will be the value...
        
    }

    static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1: ");
            int num1=sc.nextInt();
            System.out.print("Enter number 2: ");
            int num2=sc.nextInt();
            int sum=num1+num2;
            System.out.print("The Sum = "+ sum);
    }

    /*
        access modifier (we'll look in OOP) return_type name(){
            // body
            return statement;
        }
    
    */
}
