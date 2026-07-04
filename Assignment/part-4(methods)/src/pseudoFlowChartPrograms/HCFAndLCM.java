package pseudoFlowChartPrograms;

import java.util.Scanner;

public class HCFAndLCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2=sc.nextInt();

        int hcf=hcf(n1,n2);
        int lcm=lcm(n1,n2);
        System.out.println("HCF: "+ hcf);
        System.out.println("LCM: "+ lcm);


    }

    static int hcf(int n1, int n2){
        int smaller= n1>n2 ? n2 : n1;
        int hcf=1;
        int i=1;
        while (i<=smaller) {
            if(n1%i==0 && n2%i==0){
                hcf=i;
            }
            i++;
        }
        return hcf;
    }
    static int lcm(int n1, int n2){
        int large;
        if(n1>n2){
            large=n1;
        }else{
            large=n2;
        }
        int copy=large;
        while (true) {
            if(large%n1==0 && large%n2==0){
                return large;
            }else{
                large+=copy;
            }
        }
    }
}
