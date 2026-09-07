// package Basic_Sorting;

public class DecendingBubbleSort {
    public static void print(int arr[]){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,-2,6,7,2,0,7,2};
        // int arr[]={7,7,6,5,2,2,0,-2}; only O(n) best case... 
        int n=arr.length;
        print(arr);
        boolean isRevSorted=true;
        for(int i=0; i<n-1; i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1]; 
                    arr[j+1]=temp;
                    isRevSorted=false;
                }
            }
            if(isRevSorted==true) break;
        }
        print(arr);
    }
}
