public class Palindrome {
    public static void main(String[] args) {
        String s="racecar";
        Palindrome p=new Palindrome();
        System.out.println(p.isPalindrome(s));
    }
    public boolean isPalindrome(String s){
        int i=0, j=s.length()-1;
        while (i<j) {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        } 
        return true;
    }
}
