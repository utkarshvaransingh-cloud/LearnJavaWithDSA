public class Shadowing {
    // shadowing -> is a practices in java of using variable of same name with in the scope that overlaps..
   static int x = 90 ; //static(object independent) --> you cannot use object dependent thing in object independent thing 
   // this  x will be shadowed at line 8
   public static void main(String[] args) {
        System.out.println(x); // 90
        int x; // the class variable at line 4 is shadowed by this 
        
        // System.out.println(x); // scope will begin when the value is initialised
        x=40;
        System.out.println(x); // 40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
