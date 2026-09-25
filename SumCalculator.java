import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        int sum = 0;
        
        for (int i = sum; i <= num; i++) {
            sum = sum + i;
        }
        
        System.out.println("The sum from 1 to " + num + " is: " + sum);
        
        input.close();
    }
}