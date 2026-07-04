public class Max {
    public static void main(String[] args) {
        int[] arr={1, 3, 23, 9, 18};
        // System.out.println(max(arr));
        System.out.println(maxRange(arr, 1,3));

    }
    
    static int max(int[] arr){
        if (arr.length==0) {
            return Integer.MIN_VALUE;
        }
        int max=arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    //edge case
    static int maxRange(int[] arr, int start, int end){
        if(end> start){
            return -1; 
        }
        if(arr==null){
            return -1;
        }
        
        int max=arr[start];

        for(int i=start; i<=end; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
