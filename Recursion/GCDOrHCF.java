public class GCDOrHCF {
    public static void main(String[] args) {
        int a=12, b=16;
        // System.out.println(GCD(a,b));
        System.out.println(hcfLongDivision(a, b));
    }
    public static int GCD(int a, int b){
        for (int i=Math.min(a,b);i>=1;i++) {
            if(a%i==0 && b%i==0) return i; 
        }
        return 1; 
    }
    // Long division Method..
    // we could use a hepler(Math.min, Math.)
    public static int hcfLongDivision(int a, int b){
        if(a==0) return b;
        return hcfLongDivision(b%a, a);
    }
}
