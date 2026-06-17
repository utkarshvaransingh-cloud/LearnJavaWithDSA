import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Please enter the 2nd number: ");
        int num2=sc.nextInt();
        int num;

        int i=1;
        while (true) {
            num=i*num1;
            if(num%num2==0){
                System.out.println(num);
                break;
            }
            i++;
        }
        
    }
}
