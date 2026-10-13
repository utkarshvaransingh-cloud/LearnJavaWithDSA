// package Assignment.String;


/*
    string s=varan; 
    ans= a
    s=character
    c-2 , a-2, r-2 
    return a coz,Lexicographically smaller  

    method 1 nested loops ..

    method 2 sort the array count the characters
    nlog n
    -- sort(s); // s="aaccehrrt"; 

    2-pointer...
    i
    a a c c e t t t z z
        j 

    if(arr[i]!=arr[j])
        frq=j-i;
        if(maxFrq<frq){
            maxFrq=frq;
            ans=s.charAt(i); 
        }
        i=j;
    else{
        j++;
    }
        
    method 3 frequency array
    
             0 1 2 3            ......            23 24 25          
    frq[]= [                                               ]
    now, traversal through the character and update the value in the array 
*/ 

import java.util.*;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String s="character";
        // System.out.println(getMaxOccuringChar(s));
        System.out.println(getMxOccuingChar(s));
    }
    // // Brute force..
    // public static char getMaxOccuringChar(String s){
    //     int n=s.length(); 
    //     int maxFrq=-1;
    //     char ans=s.charAt(0); 

    //     for(int i=0; i<n; i++){
    //         int frq=1;
    //         char ch=s.charAt(i);
    //         for(int j=i+1; j<n; j++){
    //             if(s.charAt(j)==ch) frq++; 
    //         }
    //         if(frq>maxFrq){
    //             maxFrq=frq;
    //             ans=ch;
    //         }else if(frq==maxFrq && ch<ans){
    //             ans=ch;
    //         }
    //     }
    //     return ans; 
    // }


    // // Method 2 sort and count 2-pointer..
    // public static char getMxOccuingChar(String s){
    //     char arr[]=s.toCharArray();
    //     char ans=s.charAt(0);
    //     int n=arr.length;
    //     int maxCnt=-1;
    //     int i=0, j=0;

    //     Arrays.sort(arr);
    //     while(j<n){
    //         if(arr[i]==arr[j]) j++;
    //         else{// arr[i]!=arr[j]
    //             int frq=j-i;
    //             if(frq>maxCnt){
    //                 maxCnt=frq;
    //                 ans=arr[i];
    //             }
    //             i=j;
    //         }
    //     }
    //     int frq=j-i;
    //     if(frq>maxCnt){
    //         maxCnt=frq;
    //         ans=arr[i];
    //     }
    //     return  ans;
    // }
    
    // Method 3 frequency array and count the frequncy
    public static mostFrequentCharacter(String s){
        int n=s.length();
        int frq[]=new int[26];
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            frq[idx]++;  
        }
        int maxFrq=0;
        char a=s.charAt(0);
        for(int i=0; i<26; i++){
            if(frq[i]>maxFrq){
                a=i+97;
            }
        }
        return a;
    } 
}
