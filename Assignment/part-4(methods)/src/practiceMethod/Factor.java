import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Program of Factors.");
        System.out.print("Please enter the number: ");
        int num=sc.nextInt();

        factor(num);
    }
    public static void factor(int num){
        int original=num;
        while (num>0) {
            if(original%num==0){
                System.out.print(num+" ");
            }
            num--;
        }
    }
    
}