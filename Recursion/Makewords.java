public class Makewords {
  public static void makeWords(int size, String ans) {
    if (size != 0) {
      for (char c = 'a'; c <= 'z'; c++) {
        System.out.print(c);
      }
    }
    else {
      System.out.println(ans);
      System.out.println(makeWords(size -1))
    }
  }
  public static void main(String[] args) {
    makeWords(3,"");

    System.out.println();
  }
}
