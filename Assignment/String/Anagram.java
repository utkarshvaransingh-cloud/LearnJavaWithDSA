// package Assignment.String;

/*

    Anagram... 
    fired  --  fried
    latent  --  talent
    anagram --  nagaram
    listen -- silent 
    race  --  care 

*/

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String s1,s2;
        s1="listen";
        s2="silent";
        System.out.println(areAnageams(s1,s2));
    }
    public static boolean areAnageams(String s1, String s2){
        if(s1.length() != s2.length()) return false; 

        char arr1[]= s1.toCharArray(); n 
        char arr2[]= s2.toCharArray(); n 
        Arrays.sort(arr1); // nlog n 
        Arrays.sort(arr2);

        for(int i=0; i<arr1.length; i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;

        // T.C. - nlog n, S.C. - n
    }
}
