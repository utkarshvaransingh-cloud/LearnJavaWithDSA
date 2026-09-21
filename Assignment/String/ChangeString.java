// package Assignment.String;

public class ChangeString {
    public static void main(String[] args) {
        String s="Varan";
        System.out.println(modify(s));
    }
    public static String modify(String s){
        char ch=s.charAt(0);
        if(ch>='a' && ch<='z') return s.toLowerCase();

        return s.toUpperCase();
    } 
}
