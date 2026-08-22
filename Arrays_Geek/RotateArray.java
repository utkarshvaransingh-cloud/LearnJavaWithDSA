package Arrays_Geek;

public class RotateArray {
    static void rotateArr(){
        int n=arr.length;
        d%=n;
        reversal(arr,0,d-1);
        reversal(arr,,d,n-1);
        reversal(arr,0,n-1);

    }
    static void reversal(int arr[], int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
