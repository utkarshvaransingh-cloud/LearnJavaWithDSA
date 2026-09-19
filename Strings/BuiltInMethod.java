public class BuiltInMethod {
    public static void main(String[] args) {
        String s="Varan Singh";
        System.out.println(s.indexOf('S'));
        System.out.println(s.lastIndexOf('u'));

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        
        String a="harshita";
        System.out.println(a.contains("harsh"));
        if(a.contains("arsh"))
            System.out.println("Happy");

        System.out.println(a.startsWith("harsh"));

        a.toUpperCase();
        System.out.println(a);

        /*
            // compareTo() // ascii value comparision 
            lexographically smaller (dictionary)
            raghav < sneha      
            harmeet < harsh  // coz, m < s 
            Raghav < aditya // coz, R < a 

            s1.compareTo(s2); 
        
        */
    }
}
