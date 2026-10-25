// package Assignment.Recursion;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int n=8;
        System.out.println(sumNaturalNumber(n));
    }
    public static int sumNaturalNumber(int n){
        return n*(n+1)/2; //T.C. = O(1); 

        // // recursion..
        // if(n==1) return 1;
        // return n+sumNaturalNumber(n-1); // T.C. = O(n) 
    }
}
