public class PeakOfMountainArray {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,5,6,7,8,3,2,1,-1};
        int lo=1, hi=arr.length-2; // 0 and arr.length are boundaries , they can't be peaks (array out of bound)
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) hi=mid+1;
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) lo=mid-1;
        }
        return Integer.MIN_VALUE;
    }
}
