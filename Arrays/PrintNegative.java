import java.util.Scanner;

/**
 * PrintNegative
 */
public class PrintNegative {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }   
        // Printing negative value 
        for(int i=0;i<n;i++){
            if(arr[i]<0) System.out.print(arr[i]+" ");
        }
        
    }
}