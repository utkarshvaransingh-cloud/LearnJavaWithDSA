import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Program of Algebraic Operation");
        System.out.print("please enter the 1st number: ");
        int a=sc.nextInt();
        System.out.print("please enter the 1st number: ");
        int b=sc.nextInt();
        System.out.print("The operation  are (+,-,*,/,%)\nPlease enter the Operation you want:");
        String ope=sc.next();
        // System.out.println(ope);
        if(ope.equals("addition")){
            System.out.print("Addition: "+(a+b));
        }else if(ope.equals("subtraction")){
            System.out.print("Subtraction: "+(a-b));
        }else if(ope.equals("multiplication")){
            System.out.print("Multiplication: "+(a*b));
        }else if(ope.equals("division")){
            System.out.print("Division: "+(a/b));
        }else if(ope.equals("modulus")){
            System.out.print("Modulus: "+(a%b));
        }
    }
}
