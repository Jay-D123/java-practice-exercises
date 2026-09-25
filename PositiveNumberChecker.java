import java.util.Scanner;

public class PositiveNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();

            if (num >= 1) {
                System.out.println("Thank you! You entered: " + num);
            } else {
                System.out.println("Invalid. Please enter a positive number.");
            }
        } while (!(num >= 1));

        input.close();
    }
}