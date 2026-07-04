import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int arr[]={1, 3, 23, 9, 18, 56};
        // swap(arr, 0,4);
        // System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int idx1, int idx2 ){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }

    
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
