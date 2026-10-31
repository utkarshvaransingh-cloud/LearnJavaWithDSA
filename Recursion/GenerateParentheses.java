import java.util.*;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n=3;
        System.out.println(generateParentheses(n));
    }
    public static List<String> generateParentheses(int n){
        List<String>ans=new ArrayList<>();
        generate(n,0,0,"",ans);
        return ans;
    }
    public static void generate(int n,int l,int r,String s,List<String> ans){
        if(r==n){
            ans.add(s);
        }
        if(l<n) generate(n,l+1,r,s+'(',ans);
        if(r<l) generate(n,l,r+1,s+')',ans);
    }
}
