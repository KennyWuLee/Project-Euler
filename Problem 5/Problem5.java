public class Problem5 {
  public static long gcd(long a, long b) {
    if(b == 0)
      return a;
    return gcd(b, a%b);
  }

  public static long lcm(long a, long b) {
    return (a * b) / gcd(a,b);
  }

  public static void main(String[] args) {
    long multiple = 1;
    for(int i = 2; i <= 20; i++)
      multiple = lcm(multiple, i);
    System.out.println(multiple);
  }
}
