public class NumberOfVowels {
    public static void main(String[] args) {
        String s="trust no future, howe'er pleasant! let the dead past bury its dead! act,— act in the living present! heart within, and god o'erhead!";
        int count=0;
        for(int i=0;i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
        

    }
}
