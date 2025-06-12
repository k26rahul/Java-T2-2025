import java.util.Arrays;

public class RefDemo {
  public static void main(String[] args) {
    String[] fruits = {"apple", "banana"};

    change(fruits);
    System.out.println(Arrays.toString(fruits));
    // fruits now: kiwi, orange

    changeRef(fruits);
    System.out.println(Arrays.toString(fruits));
    // fruits still: kiwi, orange
  }

  static void change(String[] arr) {
    // modify original array
    arr[0] = "kiwi";
    arr[1] = "orange";
  }

  static void changeRef(String[] arr) {
    // new array assigned to local reference only
    arr = new String[] {"mango"};
    System.out.println(Arrays.toString(arr));
  }
}
