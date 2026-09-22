// package Strings;

public class EqualsInString {


    public static boolean equals(String s1,String s2){
        if(s1.length()!=s2.length()) return false;

        for(int i=0; i<s2.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
        // String s1="Ram";
        // String s2="Ram";
        // System.out.println(s1==s2);// true
        
        String s1="Ram";
        String s2=new String("Ram");
        // System.out.println(s1==s2);// false
        // address is compaired.
        
        
        
        
        // but // true for indivisual character
        System.out.println(s1.charAt(0)==s2.charAt(0));
        // compare character by character
        System.out.println(s1.equals(s2));
    }
}
