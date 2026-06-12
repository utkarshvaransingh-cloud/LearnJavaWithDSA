import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Palindrome Checker");
        System.out.print("please enter the number of letter in the word: ");
        int size=sc.nextInt();
        String[] word=new String[size];
        System.out.println("enter the String letters");
        int i=0;
        while (i<word.length) {
            word[i]=sc.next();
            i++;
        }
        Palindrome obj=new Palindrome();
        boolean ispalin=obj.isPalindrome(word);
        if(ispalin){
            System.out.println("it's Palindrome");
        }else{
            System.out.println("it's not Palindrome");

        }
    }
    public boolean isPalindrome(String[] str ){
       int left=0;
       int right=str.length-1;
       while(left < right){
        if(!str[left].equals(str[right])){
            return false;
        }
        left++;
        right--;
       }
        return true;
    }

}
