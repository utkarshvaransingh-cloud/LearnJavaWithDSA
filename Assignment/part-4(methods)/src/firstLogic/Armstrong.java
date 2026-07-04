import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Armstrong Checker");
        System.out.print("Please enter the number: ");
        int num=sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println("it's Armstrong");
        }else{
            System.out.println("it's not Armstrong");

        }

    }
    static boolean isArmstrong(int num){
        int original=num;
        int base=count(num);
        int sum=0;

        while (num>0) {
            int digit=num%10;
            sum+=pow(base, digit);
            num/=10;
        }

        return original == sum;
    }
    static int pow(int base, int digit){
        int result=1;
        for(int i=1; i<=base; i++){
            result*=digit;
        }
        return result;
    }
    static int count(int num){
        int count=0;
        while (num>0) {
            count++;
            num/=10;
        }
        return count;
    }
}
