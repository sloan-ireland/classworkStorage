public class Integer {
  public static int valueOfDigit(char c) {
    //helper method to convert one char to Integer
    return (c - '0');

  }
  public static int stringToInt(String s){
    //return the value of Integer.parseInt(s) but do it yourself!
    //Do not use any built in parse methods.
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      if (i == s.length() -1) {
        result += valueOfDigit(s.charAt(i));
      }
      else {
        result += valueOfDigit(s.charAt(i)) * (Math.pow(10, s.length() - 1 -i));
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(valueOfDigit('2'));
    System.out.println(stringToInt("200"));
  }
}
