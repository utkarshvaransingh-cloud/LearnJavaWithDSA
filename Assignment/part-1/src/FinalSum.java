import java.util.Scanner;

public class FinalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Final Sum");
        int sum=0;
        while (true) {
            String input=sc.next();
        System.out.print("Please enter the number: ");
            if(input.equals("x")){
                break;
            }else{
                sum+=Integer.parseInt(input);
            }
        }
        System.out.println("Final Sum: "+sum);
    }
}
