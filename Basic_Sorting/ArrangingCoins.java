public class ArrangingCoins {
    
    /*
        n=number of coins and k=number of rows.
        the number of the rows = to the number of the coins.
        we add: n = 1+2+3+4+.....+k.
            n=(k*(k+1)/2) --> 2n = k^2 +K --> 0= k^2 + k -2n
            sri dharacharya : k=sqrt(8n+1)

            eg. n=13 k=((sqrt(8n+1))-1)/2 -- (sqrt(8*13+1)-1)/2
                k=(sqrt(104+1)-1)/2 --  (sqrt(105)-1)/2 
                (10-1)/2 - 9/2 - 4 
                
                k=4 

    */
    
    
    // // method 1: maths
    // public int sqrt(long n){
    //     if(n==0) return 0;
    //     long lo=1, hi=n;
    //     while(lo<=hi){
    //         long mid=lo+(hi-lo)/2;
    //         if(mid == n/mid)return (int)mid;
    //         else if(mid>n/mid) hi=mid-1;
    //         else lo=mid+1;
    //     }
    //     return (int) hi;
    // }
    // public int arrangeCoin(int n){
    //     long m= (long)n;
    //     return (sqrt(8*m-+1)-1)/2;
    // }

    public static void main(String[] args) {
        
    }
}
