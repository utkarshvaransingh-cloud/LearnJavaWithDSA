import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* 
        Type Conversion
         --> type should be compatiable 
         --> destination type should be greater than the source type
         -->    
        */
        // float num=sc.nextFloat();
        // int num=sc.nextInt();
        // System.out.println(num);

        // Casting
        int num = (int)67.56f;
        System.out.println(num);

        // byte num1= (byte)234;
        // System.out.println(num1);

        long num2= (long)324524665366.653537;
        System.out.println(num2);

        // // automatic type promotion in expressions
        // int a=257;
        // byte b= (byte)a; // 257 % 256 = 1
        // System.out.println(b);

        // byte a=40;
        // byte b=50;
        // byte c=100;

        // int d= (a*b)/c;
        // System.out.println(d);
        

        // byte b=50;
        // b=b*2; // error, coz it's calculating in int and int can't be assign toi byte..same reason float was not assigned to int ...exept type casting...


        int number='A';
        System.out.println(number);
        // if any short byte All operation will be performed in int...
        // if long is present the All operation will be performed in long
        // if one of the operand is in float or double the the operation will be performee in float or double..
        System.out.println(3*5.6);


        byte b=42;
        char c='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=0.1234;
        double result=(f*b)+(i/c)-(d*s);
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        // float + int - double = double
        System.out.println(result);

    }
}
