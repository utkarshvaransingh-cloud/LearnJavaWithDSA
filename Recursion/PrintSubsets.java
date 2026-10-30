import java.util.*;
public class PrintSubsets {
    public static void main(String[] args) {
        String s="abc" ;
        ArrayList<String> list=new ArrayList<>();
        subsets("",s,0,list);
        System.out.println(list);
    }
    public static void subsets(String ans,String s, int i,ArrayList<String> list){
        if(i==s.length()) {
            list.add(ans);
            return ;
        }
        char ch=s.charAt(i);
        subsets(ans+ch, s, i+1,list);
        subsets(ans, s, i+1,list);
    }
}
