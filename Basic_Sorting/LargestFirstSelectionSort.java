public class LargestFirstSelectionSort {
    
    public static void print(int arr[]){
        for(int ele: arr){
            System.out.print(ele+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={8,4,1,9,-3,6,5};
        int n=arr.length;
        print(arr);
        for(int i=0;i<n-1;i++){
            int max=Integer.MIN_VALUE;
            int maxdx=-1;
            for(int j=0;j<=n-1-i;j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxdx=j;
                }
            }
            // swap 
            int tmp=arr[n-1-i];
            arr[n-1-i]=arr[maxdx];
            arr[maxdx]=tmp;
        }
        print(arr);
    }
}
