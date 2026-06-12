import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Greet");
        System.out.print("Please enter your name: ");
        String name=sc.next();
        System.out.println("Hi! "+name+" how do you do...");
    }
}
