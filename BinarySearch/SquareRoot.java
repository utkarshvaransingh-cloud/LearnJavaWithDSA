public class SquareRoot {
    // brute force
    // root of any number is from 1 to that number; 
    // explain 
    /* 
        1<=sqrt(n)<=n
        n=15,
        1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 !greater than 15....
        root=1-2-3-(4=16) which is greater,
        return root=3; 
    */

    // public static void squareRt() {
    //     int n=15;
    //     // brute force
    //     int root=0; 
    //     for(int i=0;i<=n;i++){
    //         if(i*i>n) break;
    //         root=i;
    //     }
    //     System.out.println(root);
        
    // }


    /*
    Binary Search
     
                  1<=sqrt(n)<=n
                  lo          hi

    n=20,
    1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20; 
    lo                m  !require this search space  hi 

    1  2  3  4  5  6  7  8  9
    lo       m       !rs    hi

    1   2   3   4
    lo !m       hi

    3    4
    lo   hi
    m

    4 =16 <20
    hi  lo break coz, lo crossed the hi
    m

    */
    
    public static void main(String[] args) {
        int tar=20; 
        int ans=-1;
        
        int lo=1, hi=tar;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(mid*mid==tar) return mid;
            if(mid*mid>tar) hi=mid+1;
            else if(mid*mid<tar) lo=mid+1; 
        }
        return hi; 
    }

}
