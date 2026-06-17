import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the letter: ");
        String str=sc.next().toLowerCase();
        
        switch (str) {
            case "a", "e", "i", "o", "u" ->  System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }
}
