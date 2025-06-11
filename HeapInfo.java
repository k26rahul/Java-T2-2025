public class HeapInfo {
  public static void main(String[] args) {
    String[] arr = new String[1_000_000];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = "vidu is my hero, my magic";
    }

    Runtime rt = Runtime.getRuntime();

    long total = rt.totalMemory() / (1024 * 1024);
    long free = rt.freeMemory() / (1024 * 1024);
    long used = total - free;

    System.out.println("Total Memory: " + total + " MB");
    System.out.println("Used Memory: " + used + " MB");
    System.out.println("Free Memory: " + free + " MB");
  }
}
