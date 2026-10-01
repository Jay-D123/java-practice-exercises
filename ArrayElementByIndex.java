import java.util.Scanner;

public class ArrayElementByIndex {

  public static void main(String[] args) {
    
    int[] numbers = {10, 20, 30, 40, 50};
    Scanner input = new Scanner(System.in);
    boolean found = false;

    System.out.print("Enter an index (0-4):");
    int number = input.nextInt();

    for (int index = 0; index < numbers.length; index++) {
      if (number == index) {
        System.out.println("The value at index" + index + " is: " + numbers[index]);
        found = true;
      }
    }

    if (!found) {
      System.out.println("Invalid index! Please enter a number between 0 and 4.");
    }
      input.close();
    }
  }