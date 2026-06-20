import java.util.Scanner;

public class MaxMin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Max Min program");
        System.out.print("Please enter the first number: ");
        int num1=sc.nextInt();                                
        System.out.print("Please enter the second number: ");
        int num2=sc.nextInt();                                
        System.out.print("Please enter the third number: ");
        int num3=sc.nextInt();    
        
        System.out.println("Max: "+max(num1, num2, num3));
        System.out.println("Min: "+min(num1, num2, num3));

    }
    public static int max(int a, int b, int c){
        int max=Integer.MIN_VALUE;
        if(a>b){
            if(a>c){
                max=a;
            }else{
                max=c;
            }
        }else if(b>a){
            if(b>c){
                max=b;
            }else{
                max=c;
            }
        }
        
        return max;
    }
    public static int min(int n1, int n2, int n3){
        int min=n1;
        if(n2<min){
            min=n2;
        }
        if(n3<min){
            min=n3;
        }
        return min;
    }
}