import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the age: ");
        int age=sc.nextInt();
        boolean valid=isValid(age);
        if (valid) {
            System.out.println("You are valid to vote");
        }else{
            System.out.println("You are not valid to vote");
        }
    }
    static boolean isValid(int age){
        if(age>=18){
            return true;
        }
        return false;
    }
}
