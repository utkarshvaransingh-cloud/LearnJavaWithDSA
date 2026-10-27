public class WaysToReachNthStairs {

   public static void main(String[] args) {
        int n=20;
        System.out.println(countWays(n));
   }
   public static int countWays(int n){
        if(n==1) return 1; // one way -- 1 step each time..
        if(n==2) return 2; // two ways -- 1 step at a time and 2 steps at a time..
        return countWays(n-1)+countWays(n-2);  
   }
}