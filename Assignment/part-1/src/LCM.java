import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Program of LCM");
        System.out.print("Please enter the 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Now, enter the 2nd number: ");
        int num2=sc.nextInt();
        LCM r1=new LCM();
        int lcm=r1.lcm(num1, num2);
        System.out.println("Your LCM: "+lcm);
    }
    public int lcm(int a, int b){
        int max= a > b ? a : b;
        while (true) {
            if(max%a==0 && max%b==0){
                return max;

            }
            max++;
        }
    }
}
