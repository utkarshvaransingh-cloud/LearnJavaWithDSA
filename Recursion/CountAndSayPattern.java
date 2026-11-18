public class CountAndSayPattern {
    public static void main(String[] args) {
        System.out.println(countAndSay(5 ));
    }
    public static String countAndSay(int n){
        if(n==1) return "1"; // base
        String s=countAndSay(n-1);
        // read s 
        String ans="";
        int i=0, j=0; 
        while (j<s.length()) {
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int frq=j-i;
                ans+=frq;
                ans+=s.charAt(i);
                i=j;
            }
        }
        int frq=j-i;
        ans+=frq;
        ans+=s.charAt(i);
        return ans;
    }
}
