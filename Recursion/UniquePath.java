public class UniquePath {
    public static void main(String[] args) {
        
    }
    // // recursive method
    // public static int uniquePaths(int m, int n){
    //     if(m==1 || n==1) return 1; // only one path remains either the right or down..
    //     return uniquePaths(m, n-1) + uniquePaths(m-1, n);
    // }
    
    // public static int uniquePaths(int m, int n){
    //     return paths(0,0,m,n);
    // }
    // // increase the grid from 0 to n
    // public static int paths(int cr,int cc,int lr,int lc){
    //     if(cr==lr && cc==lc) return 1;
    //     if(cr>lr || cc>lc) return 0; // Important
    //     int right=paths(cr,cc+1,lr,lc); // colunm will increase 
    //     int down=paths(cr+1,cc,lr,lc); // row will increase
    //     return right+down;
    // }


    public static int uniquePaths(int m,int n){
        return paths(m,n);
    }
    // decrease the grid from n to 0
    public static int paths(int cr, int cc){
        if(cr==1 && cc==1) return 1;
        if(cr==0 || cc==0) return 0;
        int right=paths(cr, cc-1);
        int down=paths(cr-1,cc);
        return right+down;
    }
}
