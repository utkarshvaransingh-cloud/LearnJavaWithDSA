public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={18, 12, -7, 3, 14, 28};
        int target=18324;

        System.out.println(linearSearch(arr, target, 1, 4));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length==0) return -1;

        for(int idx=start; idx<=end; idx++){
            if(arr[idx]==target){
                return idx;
            }
        }
        return -1;
    }
}
