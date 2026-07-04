public class Main {

    public static void main(String[] args) {
        // Q: store a roll number
        int a=7;
        // Q: store a person's name
        String name="Vardhan";

        // Q: store 5 roll numbers
        int rno1=23;
        int rno2=52;
        int rno3=11;

        // Array is the collection of the data types (primitives, objects, complex datatype).

        // systanx 
        // datatype[] variable_name=new datatype[size];

        // datatype represent what is the type of data stored inside the Array. 
        // all the datatype should be same, you cannot mix and match the datatypes;


        // store 5 roll numbers: 
        int[] rnos=new int [5];
        // or directly
        int[] rnos2={11, 23, 52, 51, 21};

        int[] ros; // declaration of array. ros is getting defined int the stack
        ros=new int[5];// initialisation: actually here object is being created in the memory (heap)

        System.out.println(ros[1]);

        String[] arr=new String[4];
        System.out.println(arr[0]);

        // null --> it's just a special value it can be assigned to any refrence type, it can be type cast to any type as well. can not be done(assign to ) for primitive
        // any refrence variable that you have, by default it's going to have null type 
        String str=null;
        // int num=null; // error 
        // float ft=null;
        System.out.println(str );

        // for(String element: arr){
        //     System.out.println(element);
        // }
    }
}