/*
    Character Array 

    char[] arr={'v','a','r','a','n'}; // character array are known as strings. 
    String as a datatype.

    if want to print a specific character in , suppose 'r'
    sout(arr[2]) // 'r'

    // you can access a character from a char array but,
    not from String (!allowed)
    we access with charAt() method 
*/

import java.util.Scanner;

/**
 * StringBasics
 */
public class StringBasics {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // char[]arr={'u','n','k','n','o','w','n'};

        // for(char ele:arr){
        //     System.out.print(ele+" ");
        // }

        // String x="Trust no Future, howe'er pleasant! Let the dead Past bury its dead! Act,— act in the living Present! Heart within, and God o'erhead!";
        // System.out.println(x);
        
        // String s=sc.nextLine();
        // System.out.println(s);

        // String t=sc.next();
        // System.out.println(t);

        // accessing a character 
        String n="varan";
        System.out.println(n.charAt(2)); 

        System.out.println(n.length());
    }
}