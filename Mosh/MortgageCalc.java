import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int principal = scanner.nextInt();
    float annualInterest = scanner.nextFloat();
    byte years = scanner.nextByte();

    String mortgage = getMortgage(principal, annualInterest, years);

    System.out.println("Principal: " + principal);
    System.out.println("Annual Interest: " + annualInterest);
    System.out.println("Years: " + years);
    System.out.println("Mortgage: " + mortgage);
    System.out.println("Bye");

    scanner.close();
  }

  public static double readNumber(int min, int max) {
    Scanner scanner = new Scanner(System.in);
    double number;

    while (true) {
      number = scanner.nextDouble();
      if (number >= min && number <= max) {
        break;
      }
      System.out.println(String.format("Please enter a number between {0} and {1}", min, max));
    }

    scanner.close();
    return number;
  }

  public static String getMortgage(int principal, float annualInterest, byte years) {
    float monthlyInterest = annualInterest / 100 / 12;
    float r = monthlyInterest;

    short months = (short) (years * 12);
    short n = months;

    double mortgage = principal * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1);
    NumberFormat format = NumberFormat.getCurrencyInstance();
    return format.format(mortgage);
  }
}
