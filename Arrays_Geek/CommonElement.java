// package Arrays_Geek;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        
    }
    public static ArrayList<Integer> commonElement(int a[], int b[]){
        int i=0, j=0;
        Arrays.sort(a); // mlogm
        Arrays.sort(a); // nlogn
        ArrayList<Integer> ans=new ArrayList<>();
        while (i<a.length && j<b.length) { // n+m
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]) i++;
            else if(a[i]>b[j]) j++;

        }
        return ans;
    }
}
