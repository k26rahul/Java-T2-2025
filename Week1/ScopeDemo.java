public class ScopeDemo {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;

    System.out.println("In main: x = " + x + ", y = " + y);
    someMethod();

    // main continues using its local variables
    int sum = x + y;
    System.out.println("Sum in main: " + sum);
  }

  static void someMethod() {
    // System.out.println(x); // Error: x not in scope
    System.out.println("Inside someMethod. Can't access x or y.");
  }
}
