import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Program of HCF");
        System.out.print("Please enter the 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Now, enter the 2nd number: ");
        int num2=sc.nextInt();
        HCF r1=new HCF();
        int hcf=r1.hcf(num1,num2);
        System.out.println("your HCF: "+hcf);

    }
    public int hcf(int a, int b){
        int hcf=1;
        int min=min(a,b);
        int i=1;
        while (i<=min) {
            if(a%i==0 && b%i==0){
                hcf=i;
            }
            i++;
        }
        return hcf;
    }
    public int min(int a, int b){
        if(a<b){
            return a;
        }
        return b;
    }
}
