public class CompareToStringMethod {

    public static int compareTo(String a, String b){
        int min=Math.min(a.length(),b.length());
        for(int i=0; i<min; i++){
            int diff=a.charAt(i) - b.charAt(i);
            if(diff!=0) return diff; 
        }
        return a.length() - b.length();
    }
    public static void main(String[] args) {
        String a, b;
        // a="raghav";
        // b="preet";
        // a="harmeet";
        // b="harsh";
        // // m n o p q r s // m-s=-6 
        // System.out.println(a.compareTo(b));
        // // s r q p o n m // s-m=6
        // System.out.println(b.compareTo(a));

        a="harshita";
        b="harsh";
        System.out.println(compareTo(a,b));


        // concat()....

        String y,z;
        y="Pratap";
        z="Singh";
        // System.out.println(y.concat(z));
        // a.concat(b);
        // sout(a); // not going to concat; 

        // we can do this ... but it will create a new string 
        y=y.concat(z); // create a new string "PratapSingh"
        System.out.println(y);

    }
}
