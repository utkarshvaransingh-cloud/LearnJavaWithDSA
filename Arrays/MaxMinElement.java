/**
 * MaxMinElement
 */
public class MaxMinElement {
    public static void main(String[] args) {
        int[] arr={-2, 3, 45, 56, -5, 3, 7, -28};
        int mx=arr[0];
        int mn=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(mx<arr[i]) mx=arr[i];

            if(mn>arr[i]) mn=arr[i];
        }

        System.out.println("Max: "+mx);
        System.out.println("Min: "+mn);
    }

}