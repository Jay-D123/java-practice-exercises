import java.util.Scanner;

public class LargestNumberFinder {
  public static void main(String[] args) {   
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first number: ");
    int firstNum = input.nextInt();
    System.out.print("Enter second number: ");
    int secondNum = input.nextInt();
    System.out.print("Enter third number: ");
    int thirdNum = input.nextInt();

    if (firstNum == secondNum && secondNum == thirdNum) {
      System.out.println("All numbers are equal.");
    } else if (firstNum == secondNum && firstNum >= thirdNum) {
      System.out.println("The largest number is: " + firstNum);
    } else if (firstNum == thirdNum && firstNum >= secondNum) {
      System.out.println("The largest number is: " + firstNum);
    } else if (secondNum == thirdNum && secondNum >= firstNum) {
      System.out.println("The largest number is: " + secondNum);
    } else if (firstNum > secondNum && firstNum > thirdNum) {
      System.out.println("The largest number is: " + firstNum);
    } else if (secondNum > firstNum && secondNum > thirdNum) {
      System.out.println("The largest number is: " + secondNum);
    } else {
      System.out.println("The largest number is: " + thirdNum);
    }

    input.close();
  }
}
