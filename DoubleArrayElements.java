public class DoubleArrayElements {

  public static void main(String[] args) {
    
    int[] numbers = {1, 2, 3};
    
    System.out.println("Output:");
    for (int index = 0; index < numbers.length; index++) {
      numbers[index] = numbers[index] * 2;

      System.out.print(numbers[index] + " ");
    }
  }
}