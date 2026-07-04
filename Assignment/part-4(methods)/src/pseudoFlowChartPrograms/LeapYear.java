package pseudoFlowChartPrograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year=sc.nextInt();
        boolean leap=isleap(year);
        if (leap) {
            System.out.println("it's leap");
        }else{
            System.out.println("it's not leap");

        }
    }
    static boolean isleap(int year){
        
        if((year%4==0 && year%100 != 0 )|| year%400==0){
            return true;
        }
        return false;
    }
}
