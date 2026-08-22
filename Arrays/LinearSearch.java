public class LinearSearch {
    public static void main(String[] args) {

        int[] arr={12,3,27,53,18,62,88};
        int target=53;
        int found=-111; // -111 means target array me nahi hai...
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                found=i; // any no. except, target array me hai...
                break;
            }
        }
        if(found!=-111) System.out.println("Target exist in Array at Index: "+found);
        else System.out.println("Target missing in Array");
    }
}

