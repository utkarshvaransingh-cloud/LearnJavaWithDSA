public class SearchElementInSortedAndRotatedArray {
    /*
        method 1: finding Pivot idx & then apply Binary Search 2 times..
        method 2: 
            intuition: find a sorted half : 

        if(left half is sorted){ // lo to mid is sorted 
            if(lo<= tar <m) hi=mid-1;
            else lo=mid+1;
        }
        else if(right half is sorted){ // m to hi is sorted 
            if(m<tar<=hi) lo=mid+1;
            else hi=mid-1;
        }
    */
    static int search(int arr[], int tar){
        int lo=0, hi=arr.length-1;
        while (lo<=hi) {
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==tar) return mid;
            else if(arr[lo]<=arr[mid]){// lo to mid is sorted
                if(arr[lo]<= tar && tar<arr[mid]) hi=mid-1;
                else lo=mid+1;
            }else{ // mid to hi is sorted
                if(arr[mid]<tar && tar<=arr[hi]) lo=mid+1;
                else hi=mid-1;
            }
        } 
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,10,1,2,3};
        int tar=10; 
        System.out.println(search(arr,tar));
    }


}
