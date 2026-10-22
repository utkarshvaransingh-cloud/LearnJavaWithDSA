// package Recursion;

/*
    Notes..
    we make recursion meaning full with the help of passin arguments and parameters..
    we can set the  condition so that, it won't run infinitly... 

*/
public class FunctionCallingItself {

    
    public static void main(String[] args) {
        ajay(1);   
    }
    public static void ajay(int n) {
        if(n==5) return;
        System.out.println("priya");
        ajay(n+1);
    }
}
