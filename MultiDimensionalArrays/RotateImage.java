// package MultiDimensionalArrays;

/*
    to rotate a image we need to transpose it and reverse it .
    after transpose the rows will be in reversed order so we do reverse ..
*/
public class RotateImage {

    // // clock-wise
    // public static void main(String[] args) {
    //     int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
    //     print(arr); 

    //     // Transpose .. 
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<i;j++){
    //             int tmp=arr[i][j];
    //             arr[i][j]=arr[j][i];
    //             arr[j][i]=tmp;
    //         }
    //     }

    //     print(arr);

    //     // Reverse Each Row .. 
    //     for(int i=0;i<arr.length;i++){
    //         int stCol=0, endCol=arr[0].length-1;
    //         while(stCol<endCol){
    //             int tmp=arr[i][stCol];
    //             arr[i][stCol]=arr[i][endCol];
    //             arr[i][endCol]=tmp;
    //             stCol++;
    //             endCol--;
    //         }
    //     }
    //     print(arr);
    // }
    // public static void print(int[][]arr){
    //     for(int[] a: arr){
    //         for(int ele:a){
    //             System.out.print(ele+" ");
    //         }System.out.println();
    //     }
    //     System.out.println();
    // }

    // anti-clock-wise
    public static void main(String[] args) {
        int arr[][]={{0,1,2},{3,4,5},{6,7,8}};
        print(arr);
        int tmp;
        // Transpose ..
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                tmp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=tmp;
            }
        }
        print(arr);
        // Reverse column
        for(int i=0;i<arr[0].length;i++){
            int st=0, en=arr.length-1;
            while (st<=en) {
                tmp=arr[st][i];
                arr[st][i]=arr[en][i];
                arr[en][i]=tmp;
                st++;
                en--;
            }
        }
        print(arr);
    }
    public static void print(int arr[][]){
        for(int []a:arr){
            for(int ele:a){
                System.out.print(ele+" ");
            }System.out.println();
        }System.out.println();
    }
}
