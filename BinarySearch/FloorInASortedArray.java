public class FloorInASortedArray {
    /*
    ans <= x; ans can't be greater than x in floor 

    multiple occurance is give then, use a idx=-1,
    arr={1,2,3,4,10,10,12,19} tar=5;  

        if (mid>x) go left
        if (mid<=x) idx=mid & go right 
    */

    public static void main(String[] args) {
        int arr[]={1,2,4,4,10,10,12,19};
        int tar=5;
        int lo=0, hi=arr.length-1;
        while (lo<=hi) {
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>tar) hi=mid-1;
            else if(arr[mid]<=tar){
                idx=mid;
                lo=mid+1;
            }
        }  
        return idx; 
    }
}
