public class Factorial {
  public static int Fact (int x) {
    if (x > 0) {
      return x * Fact(x-1);
    }
    else {
      return 1;
    }
  }

  public static void main(String[] args) {
    System.out.println(Fact(10));
  }
}
