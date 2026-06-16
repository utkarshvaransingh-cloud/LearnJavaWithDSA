import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String stri=sc.next();

        String rev="";
        for(int i=stri.length()-1; i>=0; i--){
            rev+=stri.charAt(i);
        }
        System.out.println("Reverse String: "+ rev);
    }
}
