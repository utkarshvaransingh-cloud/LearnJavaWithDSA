public class NonRepeatCharacter {
    public static void main(String[] args) {
        // String s="racecar";
        String s="aabbccc";
        System.out.println(nonRepeatingChar(s)); 
    }

    public static char nonRepeatingChar(String s){
        int n=s.length();
        char a='$';
        int frq[]=new int[26];
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            frq[idx]++;
        }
        int minFrq=0;
        for(int i=0; i<n; i++){
            if(frq[s.charAt(i)-'a']==1){
                a=s.charAt(i);
                break; 
            }
        } 
        return a;

    }
}
