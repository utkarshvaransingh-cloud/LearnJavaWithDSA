import java.util.Scanner;

public class Methods {
        public static void main(String[] args) {
            // Q. take input of 2 number and print the sum
            Scanner sc=new Scanner(System.in);

            System.out.print("Enter number 1: ");
            int num1=sc.nextInt();
            System.out.print("Enter number 2: ");
            int num2=sc.nextInt();
            int sum=num1+num2;
            System.out.print("The Sum = "+ sum);



            // problem do this 100 times.... it's drag .. to copy the same thing for 100 times or to update the  code, we gotta do it for 100 times...
            // coding world works on D.R.Y. --> don't repeat yourself...
            // we can bundle a piece of code in some sort of format use that format many places --> Method / Function
        }
}