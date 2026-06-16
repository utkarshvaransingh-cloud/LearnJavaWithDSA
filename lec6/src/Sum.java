import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // sum();
        // int ans=sum1();
        // System.out.println(ans);
       // // return_type --> when a function finishes its call what will be the value...
        int result=sum3(5, 7);
        System.out.println(result);
    }

    // passs the value of number when you are calling the method in main()
    static int sum3(int a, int b){
        int sum=a+b;
        return sum;
    }

    // return the value 
    static int sum1(){
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1: ");
            int num1=sc.nextInt();
            System.out.print("Enter number 2: ");
            int num2=sc.nextInt();
            int sum=num1+num2;
            return sum;
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
        return_type name(arguments){
            // body
            return statement;
        }
    
    */
}
