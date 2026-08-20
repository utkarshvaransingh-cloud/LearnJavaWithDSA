import java.util.Scanner;

public class ProductArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int product=1;
        for(int i=0;i<n;i++){
            System.out.print("Enter the the "+(i+1)+" number: ");
            arr[i]=sc.nextInt();
            product*=arr[i];
        }
        System.out.print(product);
    }    
}
