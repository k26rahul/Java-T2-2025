import java.util.*;

// Define interface Appraisable
// Define interface SpecialAppraisable

// my code starts
interface Appraisable {
  public default void appraisal(Teacher teacher) {
    double newSalary = teacher.getSalary() + (teacher.getstuPassPer() / 100 * 5000);
    teacher.setSalary(newSalary);
  }

  public abstract void checkAndUpdateSalary();
}


interface SpecialAppraisable extends Appraisable {
  public default void spAppraisal(Teacher teacher) {
    double newSalary = teacher.getSalary() + (teacher.getstuPassPer() / 100 * 10000);
    teacher.setSalary(newSalary);
  }
}
// my code ends


class Teacher implements SpecialAppraisable {
  private String name;
  private double salary;
  private double stuPassPer;

  public Teacher(String name, double salary, double stuPassPer) {
    this.name = name;
    this.salary = salary;
    this.stuPassPer = stuPassPer;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getstuPassPer() {
    return stuPassPer;
  }

  public String toString() {
    return name + ", " + salary + ", " + stuPassPer;
  }

  public void checkAndUpdateSalary() {
    if (stuPassPer >= 60 && stuPassPer < 75)
      appraisal(this);
    else if (stuPassPer >= 75 && stuPassPer <= 100)
      spAppraisal(this);
  }
}


public class Mock3 {
  // Define method printUpdatedTeachList

  // my code starts
  public static void printUpdatedTeachList(Teacher[] teachers) {
    for (Teacher teacher : teachers) {
      teacher.checkAndUpdateSalary();
      System.out.println(teacher);
    }
  }
  // my code ens

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Teacher tArr[] = new Teacher[3];
    for (int i = 0; i < tArr.length; i++)
      tArr[i] = new Teacher(sc.next(), sc.nextDouble(), sc.nextDouble());
    Mock3.printUpdatedTeachList(tArr);
  }
}
