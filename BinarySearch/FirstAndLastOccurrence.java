import java.util.ArrayList;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {

    }
    
    ArrayList<Integer> find(int arr[], int tar){
        int n=arr.length;
        int lo=0, hi=n-1, idx=-1;
        ArrayList<Integer> res=new ArrayList<>();
        
        while (lo<=hi) {
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>tar) hi=mid-1;
            else if(arr[mid]<tar) lo=mid+1;
            else{
                idx=mid;
                hi=mid-1;
            }
        }
        res.add(idx);
        
        lo=0; hi=n-1; idx=-1;
        while (lo<=hi) {
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>tar) hi=mid-1;
            else if(arr[mid]<tar) lo=mid+1;
            else{
                idx=mid;
                lo=mid+1;
            }
        }
        res.add(idx);

        return res; 
    }

}
