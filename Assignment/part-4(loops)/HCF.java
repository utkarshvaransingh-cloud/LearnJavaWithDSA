import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the 1st num: ");
        int num1=sc.nextInt();
        System.out.print("enter the 2st num: ");
        int num2=sc.nextInt();
        int num;
        int ans=0;
        if(num1<num2){
            num=num1;
        }else{
            num=num2;
        }
        int i=1;
        while (i<=num) {
            if(num1%i==0 && num2%i==0){
                ans=i;
            }
            i++;
        }
        System.out.println(ans);
    }
}
