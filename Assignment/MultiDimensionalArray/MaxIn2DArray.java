// package Assignment.MultiDimensionalArray;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int arr[][]={{53,56,67},{87,64,778},{441,56,767}};

        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>mx) mx=arr[i][j]; 
            }
        }
        System.out.println("max "+mx);
    }
}
