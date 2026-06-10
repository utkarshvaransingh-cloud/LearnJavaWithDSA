import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the leap year Program of Leap Year\n");
        System.out.print("Please enter the Year: ");
        int year=sc.nextInt();
        LeapYear leap=new LeapYear();
        boolean isLeap= leap.isLeap(year);
        if(isLeap){
            System.out.println("it's Leap Year");
        }else {
            System.out.println("it's not Leap Year");
        }
    }
    public boolean isLeap(int year){
        if((year%4==0 && year%100!=0)  || year%400==0){
            return true;
        }
        return false;
    }
}