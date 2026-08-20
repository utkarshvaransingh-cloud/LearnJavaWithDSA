package Arrays;

/**
 * ModifyOddAndEven
 */
public class ModifyOddAndEven {

    // oddELe*=2  && EvenEle+10
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};

        for(int i=0;i<arr.length;i++){
            if(i%2==1) arr[i]*=2;
            else arr[i]+=10;
            System.out.print(arr[i]);
        }    
        
    }
    

}