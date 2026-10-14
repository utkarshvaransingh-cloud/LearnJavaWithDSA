// package MultiDimensionalArrays;

public class RowWithMaxSum {
    public static void main(String[] args) {
        int arr[][]={{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int row=-1; 
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j]; 
            }
            if(sum>mx){
                mx=sum;
                row=i; 
            } 
        }
        System.out.println(mx);
        System.out.println(row);
    }
}
