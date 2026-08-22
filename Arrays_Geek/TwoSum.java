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
            return false;
        }
    }
}
