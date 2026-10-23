public class GlobleVariables {
    static int y=10;
    public static void main(String[] args) {
        // int x=10; // local to main method 
        // change(x);
        // System.out.println(x);


        fun();
        y=9; // change globle 
        System.out.println(y);
        int y=4; // local variable declare and initialise  
        System.out.println(y); 
    }
    // public static void change(int x){
    //     x=20; // local to change method 
    // }
    public static void fun(){
        // System.out.println(y+" Globle to the class");
        y=20;
    }
}
