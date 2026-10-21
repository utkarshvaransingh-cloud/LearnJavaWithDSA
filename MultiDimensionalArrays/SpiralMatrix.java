import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][]={{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(spiralTraverse(arr));

    }

    // breaking using count...
    public static ArrayList<Integer> spiralTraverse(int arr[][]){
        ArrayList<Integer>re=new ArrayList<>();
        int m=arr.length, n=arr[0].length;
        int fr=0, lr=m-1, fc=0, lc=n-1;
        int count=0, tnc=m*n;
        while (count<tnc) {
            // right
            for(int j=fc;j<=lc;j++){
                re.add(arr[fr][j]);
                count++;
            }
            fr++;
            if(count>=tnc) break;
            // down
            for(int i=fr;i<=lr;i++){
                re.add(arr[i][lc]);
                count++;
            }
            lc--;
            if(count>=tnc) break;
            // left
            for(int j=lc;j>=fc;j--){
                re.add(arr[lr][j]);
                count++;
            }
            lr--;
            if(count>=tnc) break;
            // up
            for(int i=lr;i>=fr;i--){
                re.add(arr[i][fc]);
                count++;
            }
            fc++; 
        }
        return re;
    }



    // // breaking using fr, lr, fc, lc..
    // public static ArrayList<Integer> SpiralTraverse(int[][]arr){
    //     ArrayList<Integer>ans=new ArrayList<>();
    //     int m=arr.length, n=arr[0].length; 
    //     int fr=0, lr=m-1, fc=0, lc=n-1; 
    //     while (fr<=lr && fc<=lc) {
    //         // right
    //         for(int j=fc;j<=lc;j++){
    //             ans.add(arr[fr][j]);
    //         }
    //         fr++;
    //         if(fr>lr || fc>lc) break;
    //         // down
    //         for(int i=fr;i<=lr;i++){
    //             ans.add(arr[i][lc]);
    //         }
    //         lc--;
    //         if(fr>lr || fc>lc) break;
    //         // left
    //         for(int j=lc;j>=fc;j--){
    //             ans.add(arr[lr][j]);
    //         }
    //         lr--;
    //         if(fr>lr || fc>lc) break;
    //         // up
    //         for(int i=lr;i>=fr;i--){
    //             ans.add(arr[i][fc]);
    //         }
    //         fc++;
    //     }
    //     return ans;
    // }
}
