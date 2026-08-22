// package Arrays_Geek;

/**
 * ReverseArray
 */
public class ReverseArray {

    public static void main(String[] args) {
        int arr[]={3,19,56,9,83,18,24,85,14};

        for(int ele : arr){
            System.out.print(ele+" ");
        }System.out.println();

            int i=0, j=arr.length-1;
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        for(int ele : arr){
            System.out.print(ele+" ");
        }

        // // partial reverse  2  t0 5
        // int start=2, end=5;
        // while (start<end) {
        //     int temp=arr[start];
        //     arr[start]=arr[end];
        //     arr[end]=temp;
        //     start++;
        //     end--;
        // }
        // for(int ele : arr){
        //     System.out.print(ele+" ");
        // }
    }
}