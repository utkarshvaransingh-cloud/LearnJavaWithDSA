public class BinarySearchByRecursion {
    public static void main(String[] args) {
        int arr[]={2,34,56,77,87,95,100,102,505};
        int tar=100;
        System.out.println(search(arr,tar));
    }
    public static int search(int[]arr,int tar){
        int n=arr.length;
        return helper(arr, tar, 0,n-1);
    }
    public static int helper(int arr[],int tar,int lo,int hi){
        if(lo>hi) return -1;
        int mid=lo+(hi-lo)/2;
        if(arr[mid]==tar) return mid;
        else if(arr[mid]>tar) return helper(arr, tar, lo, mid-1);
        else return helper(arr, tar, mid+1, hi);
    }
}
