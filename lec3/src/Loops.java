import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 

       /*
            Syntax of for loops: 

            for(initialisation; condition; incerament/decrement) {
                // body
            }
       */

        // Q: Print numbers from 1 to 5
        // for (int num = 1; num <= 5; num += 2){
        //     System.out.println(num);
        // } 


        // print number i to n 
        int  n=sc.nextInt();
        for (int num=0; num<=n; num++){
            // System.out.print(num+ " ");
            System.out.println("Hello World");
        }
    }
}
