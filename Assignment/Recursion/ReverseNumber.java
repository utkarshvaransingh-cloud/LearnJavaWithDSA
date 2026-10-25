public class ReverseNumber {
    /*
        call 1 revere(543, 0){
            n==0 no,
            n/10 // 3
            n*10+n%10 // 0*10+n%10=3 catch rev and  return rev
        }
        call 2 revere(54, 3){
            n==0 no,
            n/10 // 4
            n*10+n%10 // 3*10+n%10=34 catch rev and  return rev
        }
        call 3 revere(5, 34){
            n==0 no,
            n/10 // 5
            n*10+n%10 // 34*10+n%10=345 catch rev and  return rev
        }
        call 4 revere(0, 345){
            n==0 yes --> return rev 
            n/10 // 3
            n*10+n%10 // 0*10+n%10=3 
        }
    
    
    */
    
    public static void main(String[] args) {
        int n=543, rev=0;
        System.out.println(reverse(n,rev));
    }
    public static int reverse(int n, int rev){
        if(n==0) return rev;
        return reverse(n/10, rev*10+n%10); // catch the calculated rev ; 
    }
}
