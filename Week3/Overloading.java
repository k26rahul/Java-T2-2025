class Animal {
  // instance variables
  String name = "Unknown";

  // constructor (no param)
  public Animal() {
    System.out.println("inside Animal()");
  }

  // constructor
  public Animal(String name) {
    this.name = name;
    System.out.println("inside Animal(name)");
  }

  // constructor
  public Animal(String name, int age) {
    this.name = name;
    System.out.println("inside Animal(name, age)");
  }

  public void eat() {
    System.out.println("Animal eats");
  }
}

public class Overloading {

  public static void main(String[] args) {
    Animal monty = new Animal();
    Animal jimmy = new Animal("Jimmy");
    Animal kitty = new Animal("Kitty", 20);

    System.out.println(monty.name);
    System.out.println(jimmy.name);
    System.out.println(kitty.name);
  }
}