package Arrays_Geek;

public class TwoSum {
    class Solution {
        boolean twoSum(int arr[], int target){
            int n=arr.length;
            //  brute force... 
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]+arr[j]==target){
                        return true;
                    }
                }
            }

            // optimized...using 2-pointer...
            // Arrays.sort(arr);  // Array should be sorted..
            int i=0,j=n-1;
            while(i<j){
                int sum=arr[i]+arr[j];
                if(sum==target) true;
                else if(sum>target) {
                    arr[j--];
                }else{
                    arr[i++];
                }
            }
            return false;
        }
    }
}
