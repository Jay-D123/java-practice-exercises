import java.util.Scanner;
public class TriangleAreaCalculator{
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    double base, height, area;

    System.out.print("Enter the base: ");
    base = input.nextDouble();
    System.out.print("Enter the height: ");
    height = input.nextDouble();

    area = (base * height) / 2;

    System.out.println("The area of the triangle is: " + area);

    input.close();
  }
}