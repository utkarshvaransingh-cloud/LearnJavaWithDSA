import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Permutation and Combination..");
        System.out.print("Please enter the total number of items: ");
        int n=sc.nextInt();
        System.out.print("Please enter the number of items to choose: ");
        int r=sc.nextInt();

        factorial(n, r);
    }
    static void factorial(int n, int r){
        int sub=n-r;

        long nFact=1, rFact=1, subFact=1;
        while (n>0) {
            nFact*=n;
            n--;
        }
        while (r>0) {
            rFact*=r;
            r--;
        }
        while (sub>0) {
            subFact*=sub;
            sub--;
        }
        System.out.println("Permutation "+permutation(nFact, subFact));
        System.out.println("Combination "+combination(nFact, rFact, subFact));
    }

    static long permutation(long nFact, long subFact){
        return nFact/subFact;
    }
    static long combination(long nFact, long rFact, long subFact){
        return nFact/(rFact*subFact);
    }    

}
