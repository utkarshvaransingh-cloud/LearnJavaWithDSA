// package MultiDimensionalArrays;

import java.util.Scanner;

public class OutputsAndInputsIn2DArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        // int [][] arr=new int [3][4];

        int [][] arr={{6,0,2,7},{1,3,7,2},{9,9,4,5}};
        System.out.println(arr.length);// tell the length of number of rows 

        // // INPUT ..
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         arr[i][j]=sc.nextInt();  
        //     }
        // }

        // // OUTPUT..
        // for(int i=0;i<arr.length;i++){ // output the 2-d array .. 
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }System.out.println();
        // }

        // Sum of 2-D Array 
        int sum=0; 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
         
    }
}
