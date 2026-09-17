public class KthMissingPositiveInASortedArray {
    /*
        arr={1,2,5,7,8}  k=2,  miss={3,4,6,9,..} return 4;
        
        arr={3,5,6,7,8,11} k=4, miss={1,2,4,9,10,12..} return 9;
         
        arr={1,2,3,4} k=3, miss={5,6,7,8,..} return 7;

                0   1   2   3   4
         arr={  1,  2,  5,  7,  8}
                l       m       h

        correctNum=mid+1; // 2+1=3
        missing=arr[mid]-correctNum; // 5-3=2 miss num

        if(missing>=k) left
        if(missing<=k) right
    
    */
}
