import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String message=greet();
        // System.out.println(message);

        String name=sc.next();
        String personalised=myGreet(name);
        System.out.println(personalised);
    }
    static String myGreet(String name){
        String message="Hello " +name;
        return message;
    }

    static String greet(){
        String greeting="how are you";
        return greeting;
    }
}
