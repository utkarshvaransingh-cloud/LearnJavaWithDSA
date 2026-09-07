package Arrays_Geek;

public class WaveArray {
    public static convertToWave(int arr[]){
        for(int i=0;i<arr.length;i+=2) {
            if(arr[i]==arr.length-1) break;
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        
    }
}
