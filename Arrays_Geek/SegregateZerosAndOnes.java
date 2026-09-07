package Arrays_Geek;

public class SegregateZerosAndOnes {
    void segregate0and1(int arr[]){
        // // Two pass solution...
        // int numOfZeros=0, numOfOnes=0;
        // for(int ele:arr){
        //     if(ele==0) numOfZeros++;
        //     else numOfOnes++;
        // }
        // int i=0;
        // while(i<numOfZeros){
        //     arr[i]=0;
        //     i++;
        // }
        // while (i<arr.length) {
        //     arr[i]=1;
        //     i++;
        // }


        // // Single pass solution (2 pointer technique)....
        // int n=arr.length;
        // int i=0, j=n-1;
        // while(i<j){
        //     if(arr[i]==0) i++;
        //     else if(arr[j]==1) j--;
        //     else if(arr[i]==1&&arr[j]==0){
        //          arr[i]=0;
        //          arr[j]=1;
        //          i++;
        //          j--;
        //     }
        // }
    }
}
