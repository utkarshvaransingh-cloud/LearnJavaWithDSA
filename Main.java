public class Main{
  public static void main(String[] args){
    System.out.println("Hello, World!");

  }
  static int fact(int n){

      if(n<0){
        throw new IllegalArgumentException(Factorial is not defined for negative numbers);
      }
      if (n==0||n==1){
      return 1;
      }
      return n*fact(n-1);

    }
}

