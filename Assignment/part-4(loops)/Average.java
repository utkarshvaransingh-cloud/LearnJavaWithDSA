import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Total number of elements: ");
        int total=sc.nextInt();
        System.out.println();
        System.out.print("Please enter the Numbers: ");
        int sum=0;
        for(int i=0; i<total; i++){
            sum+=sc.nextInt();
        }
        float avg=sum/total;
        System.out.println();
        System.out.println("average: "+avg);
    }
}
