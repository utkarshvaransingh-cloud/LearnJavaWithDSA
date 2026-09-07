public class SecondLargest{
  public static int findSecondLargest(int [] arr){
    if(arr.length<2){
      throw new IllegalArgumentException("Array must contain at least 2 elements");
    }
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for(int num:arr){
      if (num > largest) {
        secondLargest=largest;
      largest=num;
      }else if (num > secondLargest && num != largest){
        secondLargest=num;
      }
    }
    if (secondLargest==Integer.MIN_VALUE){
      throw new IllegalArgumentException("NO second largest element found");
    }
    return secondLargest;
  }
  public static void main (String[]args){
    int []arr = {10, 5, 20, 8, 20};
    System.out.println("Second Largest Number: " + findSecondLargest(arr));
  }
}