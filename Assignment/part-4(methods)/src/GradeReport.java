import java.util.Scanner;

public class GradeReport {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Welcome to the Grade Display");
        System.out.print("Please enter the marks: ");
        int marks, sum=0, i;
        for( i=0; i<5;i++){
            System.out.print("Marks of "+(i+1)+" th Subject");
            marks=sc.nextInt();
            sum+=marks;
        }
        int percent=sum/5;

        System.out.println(grade(percent));
        
    }
    static  String grade(int percent){
        percent/=10;
        String grade=switch( percent) {
            case 9 -> "A+";
            case 8,7 -> "A";
            case 6 -> "B";
            case 5 -> "C";
            default -> "D";

        };
        return grade;
    }
}