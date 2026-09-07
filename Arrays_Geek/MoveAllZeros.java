package Arrays_Geek;
// package Basic_Sorting; 

public class MoveAllZeros {
    public static void main(String[] args) {
        int n=arr.length;
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                if(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
    }
}
