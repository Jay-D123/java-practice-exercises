import java.util.Scanner;
public class UserIntroduction {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    String name, hobby;
    int age;

    System.out.print("What is your name? ");
    name = input.next();

    System.out.print("How old are you? ");
    age = input.nextInt();

    input.nextLine();

    System.out.print("What is your favorite hobby? ");
    hobby = input.nextLine();

    System.out.printf("Nice to meet you, %s!%n", name);
    System.out.printf("You are %d years old and love %s.", age, hobby);

    input.close();
  }
}