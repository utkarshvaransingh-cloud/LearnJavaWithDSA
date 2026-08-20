package Arrays;

import java.util.Arrays;
/**
 * ShallowCopyDeepCopy
 */
public class ShallowCopyDeepCopy {

    public static void main(String[] args) {
        int a=4;// 4 Bytes
        int[] arr={10,20,30,40};// 16 Bytes
        // // Shallow Copy...
        // int[] x=arr; // x is the shallow copy of arr..
        // x[0]=100; // x is arr (same)...(both of them are pointing to the same address..)
        // System.out.print(arr[0]);

    //     // Deep Copy...
    //     int[] y=Arrays.copyOf(arr, arr.length); // deep Copy.. (copy of the original Array)
    //     // y[0]=100;
    //     y[0]=100;
    //     System.out.println(y[0]);
    //     System.out.println(arr[0]);

        // Deep copy

        int [] brr=new int[arr.length];
        for (int i = 0; i < brr.length; i++) {
            brr[i]=arr[i];
        }
        // brr is Deep Copy..
    }
}