import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={-6, 8, 14, -2, 23, 47, -7};
        int sum=0;

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }

    }    
}
