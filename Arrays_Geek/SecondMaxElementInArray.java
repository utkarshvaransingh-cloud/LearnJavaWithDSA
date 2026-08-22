// package Arrays_Geek;

public class SecondMaxElementInArray {
    static class Solution{
        public static int getSecondLargest(int arr[] ){
            int sMax=Integer.MIN_VALUE, max=Integer.MIN_VALUE;
            // calculate max..
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    sMax=max;
                    max=arr[i];
                }else if(arr[i]>sMax && arr[i]!=max){
                    sMax=arr[i];// calculate second maxinmun...
                }
            }
            // System.out.println("max: "+max);
            // System.out.println("Second Max: "+sMax);
            return sMax;
        }
        
    } 
    public static void main(String[] args) {
            int[] arr = {4, 10, 10, 6, 3, 8};
        
            int result = Solution.getSecondLargest(arr);
        
            System.out.println("Max: 10"); 
            if (result == Integer.MIN_VALUE) {
            System.out.println("Second Max: Does not exist");
            } else {
                System.out.println("Second Max: " + result);
            }
        }
}

