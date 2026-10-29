public class FirstOccurrenceByRecursion {
    public static void main(String[] args) {
        int arr[]={1,5,5,5,7,8,9,10};
        int tar=5;
        System.out.println(search(arr,tar));
    }    

    public static int search(int arr[],int tar){
        int n=arr.length;
        return helper(arr,tar,0,n-1);
    }
    public static int helper(int arr[],int tar, int lo,int hi){
        if(lo>hi) return -1;
        int m=lo+(hi-lo)/2;
        
        if(arr[m]==tar){
            int idx=helper(arr, tar, lo, m-1);
            if(idx==-1){
                return m; 
            }return idx;

        }else if(arr[m]>tar) return helper(arr, tar, m-1, hi);
        else return helper(arr, tar, m+1, hi);
    }
}
