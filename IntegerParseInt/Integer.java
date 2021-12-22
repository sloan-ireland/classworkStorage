public class Integer {
  public static int valueOfDigit(char c) {
    //helper method to convert one char to Integer
    return (c - '0');

  }
  public static int stringToInt(String s){
    //return the value of Integer.parseInt(s) but do it yourself!
    //Do not use any built in parse methods.
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(valueOfDigit('2'));
  }
}
