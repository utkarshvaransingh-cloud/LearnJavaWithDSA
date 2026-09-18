public class KthMissingPositiveInASortedArray {
    /*
        arr={1,2,5,7,8}  k=2,  miss={3,4,6,9,..} return 4;
        
        arr={3,5,6,7,8,11} k=4, miss={1,2,4,9,10,12..} return 9;
         
        arr={1,2,3,4} k=3, miss={5,6,7,8,..} return 7;

                0   1   2   3   4
         arr={  1,  2,  5,  7,  8}
                l       m       h

        correctNum=mid+1; // 2+1=3
        missing=arr[mid]-correctNum; // 5-3=2 miss num

        if(missing>=k) left
        ans=hi+1+k 
        if(missing<k) right

        return ans/ hi+1+k / lo+k

        we are adding the idx + k ... idx of the first missing place..

    
    */

    public static void main(String[] args) {
        int arr[]={1,2,5,7,8};
        int k=2;
        System.out.println(kthMissing(arr, k));
    }

    public static int kthMissing(int arr[], int k){
        int lo=0, hi=arr.length-1;
        while (lo<=hi) {
            int mid=(lo+hi)/2;
            int correctNum=mid+1;
            int miss=arr[mid]-correctNum;
            if(miss>=k) hi=mid-1;
            else if(miss<k) lo=mid+1;
        } 
        return hi+1+k; 
    } 

}
