package Arrays_Geek;

public class KthSmallest {
    public static void main(String[] args) {
        
    }
    public static int kthSmallest(int arr[],int k){
        int n=arr.length;
        // TC = O(n*k)
        for(int i=0;i<k;i++){
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for(int j=0;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            int tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
    }
}
