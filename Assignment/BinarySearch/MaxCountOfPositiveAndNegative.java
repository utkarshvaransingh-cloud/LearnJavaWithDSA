// package Assignment.BinarySearch;

public class MaxCountOfPositiveAndNegative {
    public static void main(String[] args) {
        int arr[]={-5,-4,-3,-2,-1,0,0,0,1,26,8,9,10};

        int n=arr.length;
        int leftCount=-1, rightCount=-1;

        // Count negative .. 
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=0) hi=mid-1;
            else{
                lo=mid+1;
            }
        }
        leftCount=lo;
        System.out.println(leftCount);
        
        
        // Count Positive .. 
        lo=0; hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]<=0) lo=mid+1;
            else hi=mid-1;
        }
        rightCount=n-lo;
        System.out.print(rightCount); 


    }
    
}
