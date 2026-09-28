
public class ArrayDisplay {
  public static void main(String[] args) {
    
    int[] numbers = {12, 25, 37, 44, 59};
    int count = 0;
    System.out.println("Array contents:");
    for (int number : numbers){
      System.out.println(number);

      if(number > 30){
      count++;
      }
    }
    System.out.println("Numbers greater than 30: " + count);
  }
}
