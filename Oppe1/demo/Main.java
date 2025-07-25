import java.util.*;

public class Main {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    map.put("vidu", 1);
    map.put("apple", 50);
    map.put("banana", 100);

    // for (Map.Entry<String, Integer> entry : map.entrySet()) {
    // String fruit = entry.getKey();
    // int count = entry.getValue();
    // System.out.println("we have " + count + " of " + fruit);
    // }

    for (String key : map.keySet()) {
      int val = map.get(key);
      System.out.println("we have " + val + " of " + key);
    }
  }


  // public static void main(String[] args) {
  // ArrayList<Integer> numbers = new ArrayList<>();
  // ArrayList<String> fruits = new ArrayList<>();

  // numbers.add(10);
  // numbers.add(20);
  // numbers.add(30);

  // fruits.add("apple");
  // fruits.add("banana");

  // // System.out.println(numbers);
  // // System.out.println(fruits);

  // String[] cities = {"hbh", "bhadohi"};
  // // System.out.println(cities);

  // for (String fruit : fruits) {
  // System.out.println(fruit);
  // }

  // for (String city : cities) {
  // System.out.println(city);
  // }
  // }
}
