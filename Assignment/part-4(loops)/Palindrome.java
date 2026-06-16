import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num=sc.nextInt();
        int rev=0;
        int copy=num;
        while (num>0) {
            rev=rev*10+(num%10);
            num/=10;
        }
        num=copy;
        if(rev==num){
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrome");

        }
    }
}
