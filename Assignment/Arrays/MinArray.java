/**
 * MinMaxArray
 */
public class MinArray {
    public static void main(String[] args) {
        int[] arr={7,6,65,3,43, 23,34,1, -45};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Min: "+min);
    }
    
}