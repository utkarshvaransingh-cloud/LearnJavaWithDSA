import java.util.Scanner;

public class InputAddTillZero {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Sum till zero..");
        System.out.println(sumTillZero());
    }
    static int sumTillZero(){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.print("Please enter the number, if you want to stop enter zero: ");
            int num=sc.nextInt();
            if(num==0) break;
            sum+=num;
        }
        return sum;
    }
}