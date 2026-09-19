/**
 * PassingStringToMethod
 */
public class PassingStringToMethod {
    public static void change(String x){
        x="Utkarsh";
    }
    public static void main(String[] args) {
        String x="varan";
        change(x);
        System.out.println(x);
    }
}