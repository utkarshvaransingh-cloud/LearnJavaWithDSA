public class SearchInASortedMatrix {
    //  midRow=mid/col;
    //  midCol=mid%col;
    //  modulus --> a%b = a-b * (a/b)
    public static void main(String[] args) {
        int arr[][]={
            {1,5,9},
            {14,20,21},
            {30,34,43}
        }
        int tar=14;

    }
    public static boolean searchMatrix(int[][] arr, int tar){
        int rows=arr.length, cols=arr[0].length;
        int lo=0, hi=rows*cols-1;
        while (lo<=hi) {
            int mid=(lo+hi)/2;
            int midRow=mid/cols, midCol=mid%cols;
            if(arr[midRow][midCol]==tar) return true;
            else if(arr[midRow][midCol]>tar) hi=mid-1;
            else lo=mid+1;
        }
        return false;
    }
}
