class Animal {
  String name;
  int legs = 2;

  Animal(String name) {
    this.name = name;
  }

  public void eat() {
    System.out.println("Animal eats");
  }
}

class Mammal extends Animal {
  int legs = 4;

  Mammal(String name) {
    super(name);
  }

  // public void eat() {
  // System.out.println("Mammal eats");
  // }

  public void eat(int howManyKg) {
    System.out.println("Mammal eats " + howManyKg + " food");
  }

  public void giveBirth() {
    System.out.println("Mammal gives birth");
  }
}

class Bird extends Animal {
  Bird(String name) {
    super(name);
  }

  public void layEggs() {
    System.out.println("Bird lay eggs");
  }
}

public class Inheritance {

  public static void main(String[] args) {
    Animal monty = new Mammal("Monty");
    monty.eat();
    ((Mammal) monty).eat(10);

    // Bird parrot = new Bird("Parrot");
    // parrot.eat();
  }
}