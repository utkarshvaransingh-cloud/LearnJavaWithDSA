
public class InterningNew {
    /*
        String cannot be changer immutable..
        s="raghav";

        s="madhav"; // s points to madhav raghav is free 


        s=Guddu;
        both s and t points to only one String only Guddu..
        t=Guddu;


        a=new String("Guddu"); // this will create a new Guddu


        v="Varan";
        v+="Singh";

        "VaranSingh" // a new string is made and now 'v' points to VaranSingh;
    */
    
    public static void main(String[] args) {
        String s, t;
        s="Guddu";
        t="Guddu";

        s+="Bhaiya"; // new string Guddubhaiya and s points to it..

        // String are immutable cannot change indivisiual characters;

        s="Bishal"; // change h to m ..
        // 0  1  2  3  4  5
        // B  i  s  h  a  l
        s=s.substring(0,3)+'m'+s.substring(4);
        // 3 string created "Bis" + 'm' + "al"
        // they are added to s;
        System.out.println(s);
    }    
}
