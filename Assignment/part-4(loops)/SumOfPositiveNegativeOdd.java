import java.util.Scanner;

public class SumOfPositiveNegativeOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int dig;
        int oddSum=0, posSum=0, negSum=0;
        do{

            System.out.print("enter the digits: ");
            dig=sc.nextInt();
            if(dig>0){
                posSum+=dig;
            }
            if(dig<0){
                negSum+=dig;
            }
            if(dig%2!=0){
                oddSum+=dig;
            }
        }while (dig!=0);
            
        System.out.println(oddSum);
        System.out.println(posSum);
        System.out.print(negSum);
        


    }
}
