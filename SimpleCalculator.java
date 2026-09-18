import java.util.Scanner;
public class SimpleCalculator{
  public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  int firstNumber, secondNumber;

  System.out.print("Enter first number: ");
  firstNumber = input.nextInt();

  System.out.print("Enter second number: ");
  secondNumber = input.nextInt();

  int sum = firstNumber + secondNumber;
  int difference = firstNumber - secondNumber;
  int product = firstNumber * secondNumber;
  int quotient = firstNumber / secondNumber;
  int remainder = firstNumber % secondNumber;

  System.out.printf("Sum: %d%n", sum);
  System.out.printf("Difference: %d%n", difference);
  System.out.printf("Product: %d%n", product);
  System.out.printf("Quotient: %d%n", quotient);
  System.out.printf("Remainder: %d", remainder);

  input.close();
  }
}