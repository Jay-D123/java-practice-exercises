import java.util.Scanner;

public class RectangleAreaCalculator{
  public static void main (String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the length: ");
    int length = input.nextInt();
    System.out.print("Enter the width: ");
    int width = input.nextInt();

    double area = length * width;

    System.out.println("The area of the rectangle is: " + area);

    input.close();
  }
}