class Employee {
  private int salary = 10000;

  void printSalary() {
    System.out.println(salary);
  }
}


public class DataPrivacy {
  public static void main(String[] args) {
    Employee vidu = new Employee();
    // vidu.salary = 40;
    vidu.printSalary();
  }
}
