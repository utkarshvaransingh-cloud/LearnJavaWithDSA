package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={-76,-4,9,28,47,49,510,615,9911,99999};
        int tar=510;

        int n=arr.length;
        int lo=0, hi=n-1;
        while (lo<=hi) {
            int mid=lo+(hi-lo)/2;

            if(arr[mid]>tar) hi=mid-1;
            else if(arr[mid]<tar) lo=mid+1;
            else return mid;
        }
        return -1; 
    }
}
