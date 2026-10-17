public class SearchInA2DMatrix2 {
    public static void main(String[] args) {
        int arr[][]={{1,4,7,11,15},
                     {2,5,8,12,19},
                     {3,6,9,16,22},
                     {10,13,14,17,24},
                     {18,21,23,26,30}
        };
        int tar=20;
        System.out.println(searchMatrix(arr, tar));

    }

    // // brute force 
    // //  travel through whole matrix and return the value
    // public static boolean searchMatrix(int[][] arr,int tar){
        
    //     int m=arr.length, n=arr[0].length; 
    //     for(int i=0;i<m;i++){ // T.C. = O(m*n)
    //         for(int j=0;j<n;j++){
    //             if(arr[i][j]==tar) return true;
    //         }
    //     }
    //     return false;
    // }

    /*
        but the matrix is sorted ..
        integer in every row are sorted and integer in every column is sorted..
        so, can we apply a pattern which to eliminate the Search Space..
        Algo ...
        int i=0, j=n-1;
        while(j>=0 && i<m){
            if(arr[i][j]==tar) true;
            else if(arr[i][j]>tar) {
                //go left 
                j--;
            }else if(arr[i][j]<tar){
                //go down
                i++;
            }
        }
            return true;
    */
    public static boolean searchMatrix(int arr[][],int tar){
        int n=arr.length, m=arr[0].length;
        int i=0, j=n-1;
        while (i<m && j>=0) { // T.C. O(m+n)
            if(arr[i][j]==tar)return true;
            else if(arr[i][j]>tar){
                j--; // go left
            }else{ // arr[i][j]<tar
                i++; // go down
            }
        }       

        return false; 
   }
}
