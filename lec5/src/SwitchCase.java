import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        // String fruit=in.next();
        
        // note about the .equals();
        // String a="Ram";
        // String b="Ram";
        // System.out.println(a==b); // true means pointing to the same object.. and if false then pointing to the different location ofn the memory
        // // but.equals("mango") will compare the value only not the refrence it true.
        
        
        // not much cleaner
        // if (fruit.equals("mango")) {
        //     System.out.println("King of fruit");
        // }

        // if(fruit.equals("apple")){
        //     System.out.println("a sweet red fruit");
        // }

        // // switch case..

        // switch (fruit ) {
        //     case "Mango":
        //         System.out.println("King of fruit");
        //         break;
        //     case "Apple":
        //         System.out.println("a sweet red fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("Round fruit");
        //         break;
        //     case "Grapes":
        //         System.out.println("Small fruit");   
        //         break; 
        //     default:
        //         System.out.println("Please enter a valid fruit");
        // }


        // String a=in.next();
        // switch (a) {
        //     case "one" -> System.out.println("The magic you are looking for is in the work you are avoiding the most...");
        //     case "two" -> System.out.println("Hard times create strong men. Strong men create good times. Good times create weak men. Weak men create hard times...");
        //     case "three" -> System.out.println("The man who has mastered himself has no need to prove himself.");
        //     default -> System.out.println("this is all...");
        // }

        int day=in.nextInt();

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;                   
        }

        switch (day){
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");                
        }



    }
}