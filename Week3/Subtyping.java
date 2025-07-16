class Animal {
  // void sleep() {
  // System.out.println("Animal is sleeping");
  // }
}

class Mammal extends Animal {
  void sleep() {
    System.out.println("Mammals sleep too much");
  }
}

class Bird extends Animal {

}

class Human extends Mammal {

}

class Dog extends Mammal {

}

class Sparrow extends Bird {

}

class Hero extends Human {

}

class Employee extends Human {
  void payLessMoney() {
  }
}

class Superhero extends Hero {
  String power = "smart";

  void payMoreMoney() {
  }
}

public class Subtyping {
  public static void doctor(Bird bird) {
    System.out.println("Doctor for Bird");
  }

  public static void doctor(Human human) {
    System.out.println("Doctor for Human");
    if (human instanceof Superhero) {
      ((Superhero) human).payMoreMoney();
    }
    if (human instanceof Employee) {
      ((Employee) human).payLessMoney();
    }
  }

  public static void main(String[] args) {
    // Superhero vidu = new Superhero();
    // Employee rahul = new Employee();
    // doctor(vidu);
    // doctor(rahul);

    Animal monty = new Dog();
    ((Dog) monty).sleep();

    // doctor((Human) monty);
    // System.out.println(vidu instanceof Human);
  }
}
