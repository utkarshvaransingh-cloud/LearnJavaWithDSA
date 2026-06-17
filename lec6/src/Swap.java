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
        name="Hanuman"; // creating a new object
    }

    static void swap(int num1, int num2){
        int temp=num1;
        num1=num2;
        num2=temp;// it's not passing the reference of a and b, just passing the value of a and b...
        // this change will only be valid in this function scope only 
    }
}
