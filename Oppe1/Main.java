public class Main {
  void evenDisplay(String name) {
    for (int i = 0; i < name.length(); i += 2) {
      System.out.println(name.charAt(i));
    }
  }

  public static void main(String[] args) {
    new Main().evenDisplay("vidu");
  }
}
