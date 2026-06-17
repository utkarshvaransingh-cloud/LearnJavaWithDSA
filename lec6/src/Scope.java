import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String name="Ram";
        {

            // int a=78; // already initilised outside the block so,hence; you cannot reinitilize it again..
            a=100; // reasign the original ref variable to some other value
            System.out.println(a);
            int c=99;
            name="Hanumam";
            System.out.println(name);
            // value initialized in this block, will remain in block.
        }
        int c=999;
        System.out.println(name);
        System.out.println(a);
        // System.out.println(c);// can't use out side the block..

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num=90;
            a=10000;
        }
        System.out.println(a);

    }
    static void random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
}
