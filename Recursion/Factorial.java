public class Factorial {
  public static int Fact (int x) {
    if (x > 0) {
      return x * Fact(x-1);
    }
    else {
      return 1;
    }
  }

  public static boolean isEven (int x) {
    if (x < 0) {
      return isEven(-x);
    }
    if (x > 1) {
      return isEven(x-2);
    }
    else {
      if (x == 0) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    //System.out.println(Fact(10));
    System.out.println(isEven(-10));
  }
}
