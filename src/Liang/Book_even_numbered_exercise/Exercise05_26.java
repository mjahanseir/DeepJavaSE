public class Exercise05_26 {
  public static void main(String[] args) {
    double e = 1;
    double item = 1;

    for (int i = 1; i <= 20; i++) {
      item = item / i;
      e += item;
      System.out.printf("%s%.16f%s%d\n", "The e is ", e, " for i = ", i);
    }
  }
}
