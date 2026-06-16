import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the total number element: ");
        int num=sc.nextInt();
        System.out.println("input  the element");
        int ele=0;
        for(int i=0; i<num; i++){
            ele+=sc.nextInt();
        }
        System.out.println(ele);
    }
}
