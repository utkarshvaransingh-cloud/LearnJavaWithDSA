import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun();
        //Variable length arguments...
        multiple(2, 3, "Ram","Hanuman");

        demo(2, 4);
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
