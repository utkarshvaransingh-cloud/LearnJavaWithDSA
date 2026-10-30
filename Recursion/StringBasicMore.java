import java.util.*;
public class StringBasicMore {
    public static void main(String[] args) {
        String s="Kartikey";
        // change(s);
        // System.out.println(s);
        // string is passed to methods --> is passing by value and a copy of the string is passed. 
        // String[] arr={"Ram","Sita","Hanuma","Lakshman"};
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]+" ");
        // }

        ArrayList<String>al=new ArrayList<>();
        al.add("veer");
        al.add("jai");
        al.add("arya");
        al.add("raj");
        System.out.println(al);
        change2(al);
        System.out.println(al);
    }
    private static void change2(ArrayList<String> al){
        al.add("Rohini");
    }
    private static void change(String a){
        a="Ram";
    }
}
