// package Assignment.MultiDimensionalArray;

public class ReverseAllRowsAndColumn {
    public static void main(String[] args) {
        int arr[][]={{6,9,2,7,6},{1,3,7,2,2},{9,9,4,5,2}};
        
        // Reverse all rows .. 
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }

        // Reverse all column ..
        for(int j=0;j<arr[0].length;j++){
            for(int i=arr.length-1;i>=0;i--){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
}
