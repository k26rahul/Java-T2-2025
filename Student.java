public class Student {
  // instance variables (obj properties)
  int age;
  float height;
  String name;
  boolean hasColorPencils;
  int salary = 20000;

  public static void main(String[] args) {
    // local variables (temp vars within functions)
    int money = 200;
    String address = "hbh, ka";
    Student vidu = new Student();

    System.out.println(vidu.age);
    System.out.println(vidu.height);
    System.out.println(vidu.name);
    System.out.println(vidu.hasColorPencils);
    System.out.println(vidu.salary);
  }
}
