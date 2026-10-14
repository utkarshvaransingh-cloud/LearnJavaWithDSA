// package Assignment.MultiDimensionalArray;

public class MinOutOfMaxInEachRow {
    public static void main(String[] args) {
        int [][]arr={{2,8,3,4,7}, // 8
                     {7,2,1,6,3}, // 7
                     {5,5,4,1,4}, // 5
                     {3,1,8,2,6}  // 8          
    
                    };
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            int mx=Integer.MIN_VALUE;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>mx)mx=arr[i][j];
            }
            if(min>mx) min=mx;
        }
        System.out.println(min);
    }
}
