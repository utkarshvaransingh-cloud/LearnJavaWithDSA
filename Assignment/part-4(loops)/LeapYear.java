import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int year=sc.nextInt();

        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("it's Leap Year: "+year);
        }else{
             System.out.println("it's not Leap Year: "+year);
        }
    }
}
