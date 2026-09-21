public class Plus {
    public static void main(String[] args) {
        String s="bhakti";
        s=10+s;
        s+=" hi shakti hai";
        s+=10;
        s+='a';
        s+='\n';
        s+='n';
        System.out.println(s);


        //  sout("raghav"+10+20); ? 
        // because java goes left to right 
        //  raghav30   or  raghav1020 (ans); 

        System.out.println("raghav"+10+20);

        System.out.println(10+"raghav"+20); // int+String=String;  

        System.out.println(10+20+"raghav");

        System.out.println('A'+2+"Hey"); // char+int=int; 
    }
}
