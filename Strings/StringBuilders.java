public class StringBuilders {
    public static void main(String[] args) {
        // ArrayList<Character> str=new ArrrayList<>();
        // str.add('a');
        // str.set(0,'r');
        // we can use a ArrayList / char array 

        // StringBuilder..
        StringBuilder sb=new StringBuilder(6);
        System.out.println(sb.length()+" "+sb.capacity());
        sb.append("Raghav");
        System.out.println(sb.length()+" "+sb.capacity());
        System.out.println(sb);
        sb.setCharAt(1,'o');
        System.out.println(sb);
        String t=sb.toString();
        System.out.println(t);


        // StringBuilder s=new StringBuilder("Raghav");
        // System.out.println(s.length()+" "+s.capacity());
        // System.out.println(s);
        // s.append("Raman");
        // System.out.println(s);
    }
}
