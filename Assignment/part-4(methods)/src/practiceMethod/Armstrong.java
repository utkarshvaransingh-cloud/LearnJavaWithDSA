import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Program of Armstrong.");
        System.out.print("Please enter the number: ");
        int num=sc.nextInt();
        
        boolean arm=isArmstrong(num);
        if (arm) {
            System.out.println("Armstrong");
        }else{
            System.out.println("not Armstrong");
        }
    }
    public static  boolean isArmstrong(int num){
        int original=num;
        int sum=0;
        int count=numOfDigits(num);
        while (num>0) {
            int digit=num%10;
            sum+=pow(count, digit);
            num/=10;
        }
        return original==sum;
    }
    public static int pow(int expo, int base){
        int pow=base;
        while (expo>1) {
            pow*=base;
            expo--;
        }
        return pow;
    }
    public static int numOfDigits(int num){
        int count=0;
        while (num>0) {
            count++;
            num/=10;
        }
        return count;
    }
}
