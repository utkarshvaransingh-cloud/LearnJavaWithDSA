public class SearchInDecendingSortedArray {
    public static void main(String[] args) {
        int arr[]={100,91,87,76,66,52,43,35,29,13,5};
        int tar=43, lo=0, hi=arr.length-1;
        while (lo<=hi) {
            if(arr[mid]>tar) lo=mid+1;
            else if(arr[mid]<tar) hi=mid-1;
            else return mid; 
        }
        return Integer.MIN_VALUE;
    }
}
