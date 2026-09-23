import java.util.Scanner;

public class DescendingPrinter{
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = input.nextInt();

    for(int count = num; count >= 1; count--){
      System.out.println(count);
    }
    input.close();
    System.out.println("Loop Complete!");
  }
}