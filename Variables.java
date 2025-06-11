public class Variables {
  public static void main(String[] args) {
    String message = "vidu is my hero";
    System.out.println(message);
    System.out.println(System.identityHashCode(message));

    String[] friends = {"vidu", "vishnu", "paru", "rahul"};
    System.out.println(friends);
    System.out.println(System.identityHashCode(friends));

    // https://www.rapidtables.com/convert/number/decimal-to-hex.html
    // Integer.toHexString(...)
  }
}
