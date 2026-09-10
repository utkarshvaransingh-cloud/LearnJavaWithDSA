// package BinarySearch;

public class FirstOccurrence {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,4,5,5,5,6,7,8,11};
        int tar=5;
        int lo=0, hi=arr.length-1, idx=-1;
        while (lo<=hi) {
            int mid=lo+(hi-lo)/2;

            if(arr[mid]>tar) hi=mid-1;
            else if(arr[mid]<tar) lo=mid+1;
            else{
                idx=mid;
                hi=mid-1;
            }
        }
        System.out.println(idx);
    }
}
