import java.util.Scanner;

public class EvenDaysOut {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("You Can Go Out Only on Even Days of August");
        int count=0;
        for (int i=1; i<=31; i++) {
            if(i%2==0){
                count++;
            }
        }
        System.out.println("\nTotal days = " +count);
    }
}
