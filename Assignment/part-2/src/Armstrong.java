import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the program of Armstrong");
        System.out.print("Please enter the number: ");
        int num=sc.nextInt();


        Armstrong obj = new Armstrong();

        if (obj.isArmstrong(num)) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }
    }
    public boolean isArmstrong(int num){
        int original=num;
        int pow=countDigits(num);
        int sum=0;

        while (num>0) {
            int digit = num%10;
            sum += power(digit, pow);
            num/=10;
        }
        return sum==original;
    }
    public static int countDigits(int num){
        int count=0;
        while (num>0) {
            count++;
            num/=10;
        }
        return count;
    }
   
    public static int power(int digit, int pow){
        int result=1;
        while (pow>0) {
            result*=digit;
            pow--;
        }
        return result;
    }

}
