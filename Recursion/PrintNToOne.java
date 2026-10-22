public class PrintNToOne {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        // magic of recursion ...
        // pirnt(n) function has 2 things 1st it print n and
        // rest of the things will be taken care by print(n-1) function
        if(n<=0) return ;
        System.out.print(n+" ");
        print(n-1); // sub problem
    }
}
