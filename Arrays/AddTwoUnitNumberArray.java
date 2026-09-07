import java.util.Arrays;
import java.util.Scanner;

public class AddTwoUnitNumberArray {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Welcome to Add Unit Digit Array\n");
        System.out.println("Please enter the size arrays ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println("Enter elements for first array:");
        int[] arr1=arrayInput(n1);

        System.out.println("Enter elements for second array:");
        int arr2[]=arrayInput(n2);

        System.out.println("Unit array addition: ");
        int[]res=addUnitArray(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
    static int[] arrayInput(int n){
        int[] arr=new int[n];
        System.out.println("Input only unit Digit (0-9)");
        
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            if(val<0 || val>9){
                System.out.println("invalid input\n"+ val+" Treating as 0");
                arr[i]=0;
            }else{
                arr[i]=val;   
            }
        }
        return arr;
    }
    static int[] addUnitArray(int arr1[],int arr2[]){
        
        int len1=arr1.length;
        int len2=arr2.length;
        int maxSize=Math.max(len1,len2);
        int carry=0;

        int [] res=new int[maxSize+1];
        int i=len1-1, j=len2-1;
        int k=res.length-1;

        while (i>=0 || j>=0 || carry>0){
            int sum=carry;
            if(j>=0) {
            sum+=arr2[j];
            j--;
            }
            if(i>=0){
                sum+=arr1[i];
                i--;
            }
            res[k]=sum%10;// store the unit digit
            carry=sum/10;
            k--;

        }    
        if(res[0]==0){
            return Arrays.copyOfRange(res,1,res.length);
        }                           
        return res;
        
    }
}
