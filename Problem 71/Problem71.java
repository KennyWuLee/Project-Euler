public class Problem71 {
  public static int gcd(int a, int b) {
    if(b == 0)
      return a;
    return gcd(b, a%b);
  }

  public static void main(String[] args) {
    int maxNum = 0;
    int maxDenom = 1;
    for (int denominator = 1; denominator <= 1000000; denominator++) {
      int numerator = (3 * denominator - 1) / 7;
      if(gcd(numerator, denominator) == 1 && numerator/(double)denominator > maxNum/(double)maxDenom) {
        maxNum = numerator;
        maxDenom = denominator;
      }
    }
    System.out.println(maxNum + "/" + maxDenom);
  }
}
