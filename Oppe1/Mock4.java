import java.security.KeyStore.Entry;
import java.util.*;

class Shop {
  private String name;
  private int nsold;

  public Shop(String s, int ns) {
    this.name = s;
    this.nsold = ns;
  }

  public String getName() {
    return name;
  }

  public int getItemSold() {
    return nsold;
  }
}


public class Mock4 {
  public static void printShopName(ArrayList<Shop> sList) {
    Map<String, Integer> m = new LinkedHashMap<String, Integer>();
    String shop = "";
    int sold = 0;
    // iterate through sList and add each shop object to map "m"

    // MY CODE STARTS
    String bestShop = "";

    for (Shop shopObj : sList) {
      shop = shopObj.getName();
      sold = shopObj.getItemSold();

      // store (shop : sold) in map
      if (m.containsKey(shop)) {
        m.put(shop, m.get(shop) + sold);
      } else {
        m.put(shop, sold);
      }

      // either bestShop is empty, or shop has more sales than bestShop
      if (bestShop == "" || m.get(shop) > m.get(bestShop)) {
        bestShop = shop;
      }
    }

    shop = bestShop;
    sold = m.get(bestShop);
    // MY CODE ENDS

    System.out.println(shop + " : " + sold);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Shop> list = new ArrayList<Shop>();
    for (int i = 0; i < 4; i++) {
      list.add(new Shop(sc.next(), sc.nextInt()));
    }
    printShopName(list);
  }
}
