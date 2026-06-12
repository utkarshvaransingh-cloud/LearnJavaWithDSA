import java.util.Scanner;

public class OddEven {

    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Odd Even");
        System.out.print("Please enter the number: ");
        int num=sc.nextInt();

        OddEven oe=new OddEven();
        boolean even=oe.isEven(num);
        if(even){
            System.out.println("your number is even");
        }else{
            System.out.println("your number is odd");
        }
        
    }
    public boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return  false;
    }
}