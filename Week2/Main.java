class Animal {
  void sleep() {
    System.out.println("Animal is sleeping");
  }

  void eat() {
    System.out.println("Animal is eating");
  }
}


class Mammal extends Animal {
  void sleep() {
    System.out.println("Mammal is sleeping");
  }

  void run() {
    System.out.println("Mammal is running");
  }
}


public class Main {
  public static void main(String[] args) {
    Animal obj = new Mammal();
    obj.sleep();
    obj.eat();
    // obj.run();
    // if (obj instanceof Mammal) {
    // Mammal mammal = (Mammal) obj;
    // mammal.run();
    // }
  }
}
