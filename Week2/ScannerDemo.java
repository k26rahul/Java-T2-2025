import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // int age = scanner.nextInt();
    // float height = scanner.nextFloat();
    // int salary = scanner.nextInt();
    // String apple = scanner.next();

    // System.out.println(age);
    // System.out.println(height);
    // System.out.println(salary);
    // System.out.println(apple);

    System.out.println(scanner.nextLine());
    System.out.println(scanner.nextInt());
    scanner.close();
  }
}
