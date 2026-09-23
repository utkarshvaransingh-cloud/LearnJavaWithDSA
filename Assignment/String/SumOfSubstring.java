public class SumOfSubstring {
    public static void main(String[] args) {
        String s="6759";
        System.out.println(sumSubstring(s));   
    }

    public static int sumSubstring(String s ){
        int ans=0;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                String sub=s.substring(i,j+1);
                ans+=Integer.parseInt(sub);
            }
        }

        return ans;
    }
}
