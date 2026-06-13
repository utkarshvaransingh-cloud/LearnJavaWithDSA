import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);   
        // Take input from user till user does not press X or x

        int ans=0;
        while(true){
            // take the operater as input 
            System.out.print("Enter the operator: ");
            char op=in.next().trim().charAt(0); // trim -> is for if user leaves space before the input  and  charAt -> is for if user input more than one input then take at oth idx input
            System.out.println();
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
            System.out.println("Enter two number: ");    
            int num1=in.nextInt();
            int num2=in.nextInt();

                if(op == '+'){
                ans=num1+num2;
                }
                if(op == '-'){
                ans=num1-num2;
                }
                if(op == '*'){
                ans=num1*num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                        ans=num1/num2;
                    }
                }
                if(op == '%'){
                ans=num1%num2;
                }
            } else if(op == 'x' || op =='X'){
                break;
            }else{
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
    }
}
