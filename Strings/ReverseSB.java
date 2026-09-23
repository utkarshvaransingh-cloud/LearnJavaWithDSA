import java.util.*;

public class ReverseSB {
    public static void main(String[] args) {
        // String s="Ram";
        // StringBuilder sb=new StringBuilder(s);
        // sb.append("Singh");
        // // sb.reverse();
        // Collections.sort(sb);// does not work



        // // int i=0, j=sb.length()-1;
        // // while (i<=j) {
        // //     char tmp1=sb.charAt(i);
        // //     char tmp2=sb.charAt(j);
        // //     sb.setCharAt(i,tmp2 );
        // //     sb.setCharAt(j, tmp1);
        // //     i++;
        // //     j--;
        // // }
        // // System.out.println(sb);

        // sb.deleteCharAt(2);// it's very costly coz, deleting and shifting the character   
        // System.out.println(sb);
        // sb.insert(2, 'm'); 
        // System.out.println(sb);
        // sb.delete(1,3);
        // System.out.println(sb);

        String s="Varan";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        s=sb.toString();
        System.out.println(s);
    }
}
