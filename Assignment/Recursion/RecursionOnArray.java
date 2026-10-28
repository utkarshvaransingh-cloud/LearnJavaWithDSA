
public class RecursionOnArray {

    public static void main(String[] args) {
        int [] arr={3,5,6,7,7876,3,535};
        int ele=7;
        // recPrint(arr, 0);
        System.out.println(exists(arr,ele,0));
    }
    public static void recPrint(int[] arr,int idx){
        if(idx==arr.length) return;
        recPrint(arr, idx+1);
        System.out.print(arr[idx]+" ");
    }
    public static boolean exists(int[] arr,int ele,int idx){
        if(idx==arr.length) return false;
        if(arr[idx]==ele) return true;
        return exists(arr, ele, idx+1);

    }
}