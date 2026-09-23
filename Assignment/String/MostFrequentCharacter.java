// package Assignment.String;


/*
    string s=varan; 
    ans= a
    s=character
    c-2 , a-2, r-2 
    return a coz,Lexicographically smaller  

    method 1 nested loops ..
    method 1 pass count..

*/ 

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String s="character";
        System.out.println(getMaxOccuringChar(s));
    }
    // Brute force..
    public static char getMaxOccuringChar(String s){
        int n=s.length(); 
        int maxFrq=-1;
        char ans=s.charAt(0); 

        for(int i=0; i<n; i++){
            int frq=1;
            char ch=s.charAt(i);
            for(int j=i+1; j<n; j++){
                if(s.charAt(j)==ch) frq++; 
            }
            if(frq>maxFrq){
                maxFrq=frq;
                ans=ch;
            }else if(frq==maxFrq && ch<ans){
                ans=ch;
            }
        }
        return ans; 
    }
    
}
