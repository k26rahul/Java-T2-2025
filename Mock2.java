import java.util.Scanner;

class Faculty {
  private String name;
  private double salary;

  public Faculty(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public double bonus(float percent) {
    return (percent / 100.0) * salary;
  }
  // Define method getDetails()
  // Override method getDetails(float percent)

  // MY CODE STARTS
  public String getDetails() {
    return String.format("%s, %.1f", name, salary);
  }

  public String getDetails(float percent) {
    return String.format("%s, %.1f, bonus = %.1f", name, salary, bonus(percent));
  }

  // my note: They didn't told this in question, but we have to create methods
  // getName and getSalary, because name and salary are private,
  // and cannot be accessed in child (Hod) class.
  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }
  // MY CODE ENDS
}


class Hod extends Faculty {
  private String personalAssistant;

  public Hod(String name, double salary, String pa) {
    super(name, salary);
    this.personalAssistant = pa;
  }
  // Override method bonus(float percent)
  // Override method getDetails()
  // Override method getDetails(float percent)

  // MY CODE STARTS
  public double bonus(float percent) {
    return super.bonus(percent) * 0.50;
  }

  public String getDetails() {
    return String.format("%s, %.1f, %s", getName(), getSalary(), personalAssistant);
  }

  public String getDetails(float percent) {
    return String.format("%s, %.1f, %s, %.1f", getName(), getSalary(), personalAssistant,
        bonus(percent));
  }
  // MY CODE ENDS
}


public class Mock2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Faculty obj1 = new Faculty(sc.next(), sc.nextDouble());
    Faculty obj2 = new Hod(sc.next(), sc.nextDouble(), sc.next());
    System.out.println(obj1.getDetails());
    System.out.println(obj1.getDetails(10));
    System.out.println(obj2.getDetails());
    System.out.println(obj2.getDetails(10));
  }
}
