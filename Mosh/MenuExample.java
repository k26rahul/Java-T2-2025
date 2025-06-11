import java.util.Scanner;

public class MenuExample {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      showMenuAndHandleInput();
    }
  }

  static void showMenuAndHandleInput() {
    System.out.println("\n--- Menu ---");
    System.out.println("1. Say Hello");
    System.out.println("2. Add Two Numbers");
    System.out.println("3. Exit");
    System.out.print("Choose: ");
    int choice = scanner.nextInt();

    switch (choice) {
      case 1:
        sayHello();
        break;
      case 2:
        addTwoNumbers();
        break;
      case 3:
        System.exit(0);
      default:
        System.out.println("Invalid choice.");
    }
  }

  static void sayHello() {
    System.out.println("Hello!");
  }

  static void addTwoNumbers() {
    System.out.print("Enter first number: ");
    int a = scanner.nextInt();
    System.out.print("Enter second number: ");
    int b = scanner.nextInt();
    System.out.println("Sum is: " + (a + b));
  }
}
