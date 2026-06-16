public class Swap {
    public static void main(String[] args) {
        int a=10;
    int b=20;

    // // swap number code 
    // int temp=a;
    // a=b;
    // b=temp;
    // System.out.println(a+ " "+b); 

    // swap(a, b);
    // System.out.println(a+ " "+b);

        String name="Ram";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name){
        name="Hanuman";
    }

    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;

    }
}
