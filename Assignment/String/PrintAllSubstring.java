// package Assignment.String;

/*
    substring ="ram"; // r, a, m, ra, am, ram
     
*/
public class PrintAllSubstring {
   public static void main(String[] args) {
        String s="Ram";
    
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                System.out.print(s.substring(i,j+1)+" "); // i to j 
            }
            System.out.println();
        }
    }
}
